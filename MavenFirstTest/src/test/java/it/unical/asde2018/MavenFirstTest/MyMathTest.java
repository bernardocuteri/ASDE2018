package it.unical.asde2018.MavenFirstTest;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	
	@Before
	public void executeBefore() {
		System.out.println("Before");
	}

	@Test
	public void fibonacciTest1() {
		MyMath math = new MyMath();
		
		assertEquals(8, math.fibonacci(5));
		System.out.println("test1");
		
	}
	
	@Test
	public void fibonacciTest2() {
		MyMath math = new MyMath();
		assertEquals(1, math.fibonacci(0));
		System.out.println("test2");
	}
	
	@AfterClass
	public static void cleanUp() {
		System.out.println("After class");
	}
	
}
