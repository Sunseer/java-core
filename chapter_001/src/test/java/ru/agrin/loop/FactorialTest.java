package ru.agrin.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest
{
	@Test
	public void testFactorial() {
        	Factorial fact = new Factorial();
        	long result = fact.factorial(5L);
		assertThat(result, is (120L));
	}

}