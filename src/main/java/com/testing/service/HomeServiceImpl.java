package com.testing.service;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl 
{

	public String getCallFromService() 
	{
		return "welcome";
	}
	
}
