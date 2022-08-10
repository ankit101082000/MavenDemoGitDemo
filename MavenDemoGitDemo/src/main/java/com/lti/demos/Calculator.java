package com.lti.demos;

public class Calculator {

	public String sayHello()
	{
		return "Hello World";
	}
	public int addNos(int x, int y)
	{
		int result = x+y;
		return result;
	}
	
	public int subNos(int x, int y)
	{
		int result = x-y;
		return result;
	}
	public void searchEmp(int empId) 
	{
		if(empId == 0)
		{
			throw new ArithmeticException("You entered zero");
		}
		else
		{
			System.out.println("Do something!");
		}
	}
	
	
	
	
	
	
}
