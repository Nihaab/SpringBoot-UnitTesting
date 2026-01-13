package com.testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.service.HomeServiceImpl;

@RestController
public class HomeController 
{
	@Autowired
	private HomeServiceImpl hs;
	
	@RequestMapping("/welcome")
	public String getMsg()
	{
		return hs.getCallFromService();
	}
}
