package com.hello;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class SpringDemoTest {

	private SpringDemo springDemo;
	@Before
	public void setUp(){
		springDemo = new SpringDemo();
	}
	
	@Test
	public void testSpringDemoShow(){
		
		springDemo = mock(com.hello.SpringDemo.class);
		when(springDemo.show()).thenReturn("Manoj");
		assertEquals("Manoj", springDemo.show());
	}
}
