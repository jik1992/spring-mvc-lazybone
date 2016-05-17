package com.gxb.controller;


import com.gxb.dao.AppUserMapper;
import com.gxb.domain.AppUser;
import com.gxb.service.DemoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
  AppUserMapper appUserMapper;

  @Resource
  DemoService demoService;

  @Resource
  JedisPool pool;


  @RequestMapping(value = "/jdbc", method = RequestMethod.GET)
  @ApiOperation(value = "")
  public Object jdbc() {
    return template.queryForList("show tables;");
  }

  @RequestMapping(value = "/redis", method = RequestMethod.POST)
  public Object redis() {
    pool.getResource().set("key", "value");
    return pool.getResource().get("key");
  }

  @RequestMapping(value = "/session", method = RequestMethod.POST)
  public Object index(HttpServletRequest request) {
    HttpSession session = request.getSession();
    session.setAttribute("session", "ok");
    return session.getAttribute("session");
  }

  @RequestMapping("/api")
  @ApiOperation(value = "测试", httpMethod = "GET")
  public Object index() {
    return demoService.test("test api");
  }

  @RequestMapping(value = "/orm", method = RequestMethod.GET)
  public Object orm(String param) {
    AppUser user = appUserMapper.selectByPrimaryKey("5c4b1e29-edc9-4f21-8d9a-9263a4270773");
    return user;
  }


}
