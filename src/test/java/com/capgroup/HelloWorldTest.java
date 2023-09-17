package com.capgroup;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld helloWorld = new HelloWorld();
		
		assertEquals(helloWorld.Hello(), "Hello World");
	}
}
