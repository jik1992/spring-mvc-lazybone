package com.gxb.service;

import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by ZuoYun on 5/13/16. Time: 2:32 PM Information:
 */

@Component
public class DemoService {

  final static Logger logger = LoggerFactory.getLogger(DemoService.class);

  @Cacheable(value = "cache", key = "#name")
  public String test(String name) {
    System.out.println("测试缓存" + RandomUtils.nextInt(0, 1000));
    return name;
  }
}
