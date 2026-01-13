package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.testing.controller.HomeController;
import com.testing.service.HomeServiceImpl;

@WebMvcTest(controllers = HomeController.class)
public class HomeControllerTesting 
{
	@MockBean
	private HomeServiceImpl hs;
	
	
	@Autowired
	private MockMvc mockmvc;
	
	@Test
	public void testgetMsg() throws Exception
	{
		when(hs.getCallFromService()).thenReturn("papu");
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/welcome");
		
		MvcResult result = mockmvc.perform(request).andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		String body = response.getContentAsString();
		
		assertEquals("pappu", body);
		
	}
}
