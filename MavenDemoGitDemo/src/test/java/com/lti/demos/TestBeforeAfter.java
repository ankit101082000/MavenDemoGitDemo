package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	Calculator c = new Calculator(); 
	int sum = 0;
	
	@BeforeAll
	public static void testStartDbConn()
	{
		System.out.println("DB connection is up - only one");
	}
	
	@BeforeEach
	public void testStartup()
	{
		sum = 0;
		System.out.println("Sum is zero" + sum);
	}
	
	
	@Test
	public void testAddTwoNos()
	{
		System.out.println("test case 1");
		int result = c.addNos(100, 200);
		Assertions.assertEquals(300,  result);
	}
	
	
	@Test // message is optional // if test case fails- msg displayed
	public void testSubTwoNos() {
		
		System.out.println("test case 2");
		int result = c.subNos(300, 100);
		Assertions.assertEquals(200, result, "Please check subtraction method code");
	}
	
	
	@AfterEach
	public void testShutDown()
	{
		System.out.println("Some Objects Null");
	}
	
	@AfterAll //used only once
	public static void testShutdownConn()
	{
		System.out.println("Shutting down db connection");
	}
}
