package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTesting 
{
	//@Autowired
	//private Calculator cal; 
	
	private static Calculator cal;
	
	@BeforeAll
	//@BeforeEach
	public static void calculatorTesting()
	{
		cal = new Calculator();
	}

	
	@Test
	@ParameterizedTest
	@ValueSource(ints= {10,20,30,40,50})
	//@CsvFileSource
	public void additionTesting(int a)
	{
		//Calculator cal = new Calculator();
		
		int result = cal.addition(a, 20);
		
		assertEquals(70, result);
	}
	
	@Test
	public void multiplicationTesting()
	{
		//Calculator cal = new Calculator();
		
		int result = cal.multiplication(10, 20);
		
		assertEquals(200, result);
	}
	
	@AfterAll
	//@AfterEach
	public void destroyCalObject()
	{
		cal=null;
	}
}
