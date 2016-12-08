package ru.agrin.loop;

public class Factorial {

	public long factorial(long fact) {
		if(fact < 0) 
			throw new IllegalArgumentException("factorial should be >= 0");
		long x = 1L;
		for(long i = 2L; i <= fact; i++)
			x *= i;
		return x;
	}
}