package com.gxb.config;

import com.google.common.base.Predicate;
import com.google.common.collect.Sets;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableWebMvc //NOTE: Only needed in a non-springboot application
@EnableSwagger2 //Enable swagger 2.0 spec
@ComponentScan(basePackages = {
    "com.gxb.controller"
})

public class MySwaggerConfig implements InitializingBean {

  @Bean
  public Docket appApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .groupName("app")
        .apiInfo(apiInfo())
        .forCodeGeneration(true)
        .select()
        .paths(appPaths())
        .build();
  }

  private Predicate<String> appPaths() {
    return or(
        regex("/.*"));
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("文档显示标题 (REST API)")
        .description("文档显示说明")
        .termsOfServiceUrl("http://www.example.com")
        .contact("admin@example.com")
        .license("Apache License Version 2.0")
        .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
        .version("版本")
        .build();
  }

  @Bean
  public Docket configSpringfoxDocket_all() {
    return new Docket(DocumentationType.SWAGGER_2)
        .produces(Sets.newHashSet("application/json"))
        .consumes(Sets.newHashSet("application/json"))
        .protocols(Sets.newHashSet("http", "https"))
        .forCodeGeneration(true)
        .apiInfo(apiInfo())
        .select().paths(regex(".*"))
        .build();
  }

  public void afterPropertiesSet() throws Exception {

  }
}
