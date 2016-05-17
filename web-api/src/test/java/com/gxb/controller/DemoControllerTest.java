package com.gxb.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import io.github.robwin.markup.builder.MarkupLanguage;
import springfox.documentation.staticdocs.Swagger2MarkupResultHandler;

/**
 * Created by ZuoYun on 5/17/16. Time: 9:03 AM Information:
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring-servlet.xml",
                               "classpath:spring/spring-*.xml",
})

public class DemoControllerTest {

  @Autowired
  private WebApplicationContext context;


  private MockMvc mockMvc;

  @Before
  public void setUp() {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
  }

  @Test
  public void convertSwaggerToAsciiDoc() throws Exception {
    this.mockMvc.perform(MockMvcRequestBuilders.get("/v2/api-docs")
                             .accept(MediaType.APPLICATION_JSON))
        .andDo(Swagger2MarkupResultHandler.outputDirectory("src/docs/asciidoc/generated").build())
        .andExpect(MockMvcResultMatchers.status().isOk());
  }

  @Test
  public void convertSwaggerToMarkdown() throws Exception {
    this.mockMvc.perform(MockMvcRequestBuilders.get("/v2/api-docs")
                             .accept(MediaType.APPLICATION_JSON))
        .andDo(Swagger2MarkupResultHandler.outputDirectory("src/docs/markdown/generated")
                   .withMarkupLanguage(MarkupLanguage.MARKDOWN).build())
        .andExpect(MockMvcResultMatchers.status().isOk());
  }


}