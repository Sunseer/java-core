package ru.agrin.loop;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest
{
	@Test
	public void testCalculate() {
        	Square square = new Square(1f, 2f, 3f);
        	float result = square.calculate(2);
		assertThat(result, is(11f));
	}

	@Test
	public void testShow() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		Square square = new Square(1f, 2f, 3f);
		square.show(1, 1, 1);
		String sep = System.getProperty("line.separator");
		assertThat(outputStream.toString(), is ("x = 1; y = 6.0" + sep));
	}
}