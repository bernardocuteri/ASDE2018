package it.unical.asde2018.MavenFirstTest;

public class MyMath {

	
	public int fibonacci(int position) {
		if(position < 0) {
			throw new IllegalArgumentException("Fibonacci position has to be positive");
		}
		if(position == 0) {
			return 1;
		}
		if(position == 1) {
			return 1;
		}
		
		return fibonacci(position-1)+fibonacci(position-2);
		
	}
}
