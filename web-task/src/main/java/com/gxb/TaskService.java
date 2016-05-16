package com.gxb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by ZuoYun on 5/13/16. Time: 10:18 AM Information:
 */
@Component
public class TaskService implements InitializingBean {

  final static Logger logger = LoggerFactory.getLogger(TaskService.class);


  @Scheduled(cron = "0/5 * *  * * ? ")   //每5秒执行一次
  public void task1() {
    System.out.println("测试~");
  }

  public void afterPropertiesSet() throws Exception {
    System.out.println("定时器 启动");
  }
}
