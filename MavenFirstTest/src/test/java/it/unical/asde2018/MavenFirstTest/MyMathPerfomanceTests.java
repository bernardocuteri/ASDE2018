package it.unical.asde2018.MavenFirstTest;

import org.junit.Test;

public class MyMathPerfomanceTests {
	
	private MyMath myMath = new MyMath();
	
	@Test(expected = IllegalArgumentException.class)
	public void testException() {
		myMath.fibonacci(-1);
	}

	@Test(timeout = 10000)
	public void performanceTest1() {
		System.out.println(myMath.fibonacci(20));
		
	}
}
