package com.gxb.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Created by ZuoYun on 5/17/16. Time: 2:29 PM Information:
 */

public class MyJsonMapper extends ObjectMapper {

  public MyJsonMapper() {
    this.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
  }
}

