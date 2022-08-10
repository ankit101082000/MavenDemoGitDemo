package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	
	Calculator c = new Calculator();

	@Disabled
	@Test
	public void testSayHello()
	{
		
		Assertions.assertEquals("Hello World", c.sayHello());
		
	}
	@Disabled
	@Test
	public void testAddTwoNos()
	{
		int result = c.addNos(100, 200);
		Assertions.assertEquals(300,  result);
	}
	
	@Disabled
	@Test // message is optional // if test case fails- msg displayed
	public void testSubTwoNos() {
		int result = c.subNos(300, 100);
		Assertions.assertEquals(200, result, "Please check subtraction method code");
	}
	
	@Disabled
	@Test
	public void testAssertNulls()
	{
		String s1 = null;
		String s2 = "Ankit";
		Assertions.assertNull(s1);
	}
	
	@Disabled
	@Test
	public void testAssertFalse()
	{
		Assertions.assertFalse("Ankit".length()==10);
		Assertions.assertFalse(10>20, "10 is lesser");
		Assertions.assertNotEquals("Hello", "hello");
	}
	
	@Test
	public void testArrays()
	{
		ArrayList<Integer> myList = new ArrayList<>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2, myList.size());
	}
}
