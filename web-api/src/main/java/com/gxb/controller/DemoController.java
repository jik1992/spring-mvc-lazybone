package com.gxb.controller;


import com.gxb.service.DemoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import redis.clients.jedis.JedisPool;

/**
 * Created by ZuoYun on 5/12/16. Time: 3:14 PM Information:
 */
@RestController
@RequestMapping("/v1")
@Api(value = "demo")
public class DemoController {

  final static Logger logger = LoggerFactory.getLogger(DemoController.class);

  @Resource
  JdbcTemplate template;

  @Resource
  DemoService demoService;

  @Resource
  JedisPool pool;

  @RequestMapping("/api")
  @ApiOperation(value = "测试", httpMethod = "GET")
  public Object index() {
    return demoService.test("test api");
  }

  @RequestMapping(value = "/jdbc", method = RequestMethod.GET)
  @ApiOperation(value = "")
  public Object jdbc() {
    List<Map<String, Object>> result = template.queryForList("show tables;");
    return result;
  }

  @RequestMapping("/redis")
  public Object redis() {
    pool.getResource().set("key", "value");
    return pool.getResource().get("key");
  }

  @RequestMapping("/session")
  public Object index(HttpServletRequest request) {
    HttpSession session = request.getSession();
    session.setAttribute("session", "ok");
    return session.getAttribute("session");
  }


}
