package com.gxb.tool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by ZuoYun on 5/13/16. Time: 11:33 AM Information:
 */
@Component
public class RedisFactory {

  final static Logger logger = LoggerFactory.getLogger(RedisFactory.class);

  @Resource

  static JedisPool pool;


  public Jedis getRources() {
    return pool.getResource();
  }

}
