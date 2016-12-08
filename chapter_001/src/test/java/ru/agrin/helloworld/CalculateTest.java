package ru.agrin.helloworld;

import java.io.ByteArrayOutputStream;
import org.junit.Test;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculateTest {

	@Test
	public void testConsolePrint(){
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		Calculate.main(null);
		assertThat(outputStream.toString(), is ("Hello world"));
	}
}