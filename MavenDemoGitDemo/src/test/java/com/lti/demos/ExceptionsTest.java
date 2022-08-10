package com.lti.demos;


import org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class ExceptionsTest {
	
	 
	 // dev writes exception- junit checks whether the exceptions are handled or not
	@Test
	void testExceptions() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
				
								()-> {Integer.parseInt("one");}
		);
	}
		
		@Test
		public void testmethodExp()
		{
			Calculator c = new Calculator();
			final Exception e = assertThrows(ArithmeticException.class, 
								()->{c.searchEmp(0);});
				
			Assertions.assertEquals("You entered zero", e.getMessage());
		
	}


	
}
