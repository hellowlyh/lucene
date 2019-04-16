package com.example.lucene;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LuceneApplicationTests {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	/**
	 * 构建mvc环境
	 */
	public  void setup(){
		mockMvc= MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void whenCreatSuccess()throws  Exception{
		String content = "{\"username\":\"terry\",\"password\":\"123123\",\"role\":\"0\"}";
		String reuslt=mockMvc.perform(MockMvcRequestBuilders.post("/user")
		.contentType(MediaType.APPLICATION_JSON_UTF8)
		.content(content))
				.andExpect(status().isOk())
				//.andExpect(jsonPath("$.id").value("1"))
				.andReturn().getResponse().getContentAsString();

		System.out.println(reuslt);
	}

}
