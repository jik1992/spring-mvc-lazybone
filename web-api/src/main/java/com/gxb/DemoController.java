package com.gxb;


import com.gxb.service.DemoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import redis.clients.jedis.JedisPool;

/**
 * Created by ZuoYun on 5/12/16. Time: 3:14 PM Information:
 */
@Controller
@RequestMapping("/v1")
public class DemoController {

  final static Logger logger = LoggerFactory.getLogger(DemoController.class);

  @Resource
  JdbcTemplate template;

  @Resource
  DemoService demoService;

  @Resource
  JedisPool pool;

  @RequestMapping("/api")
  @ResponseBody
  public Object index() {
    return demoService.test("test api");
  }

  @RequestMapping("/jdbc")
  @ResponseBody
  public Object jdbc() {
    List<Map<String, Object>> result = template.queryForList("show tables;");
    return result;
  }

  @RequestMapping("/redis")
  @ResponseBody
  public Object redis() {
    pool.getResource().set("key", "value");
    return pool.getResource().get("key");
  }

  @ResponseBody
  @RequestMapping("/session")
  public Object index(HttpServletRequest request) {
    HttpSession session = request.getSession();
    session.setAttribute("session", "ok");
    return session.getAttribute("session");
  }


}
