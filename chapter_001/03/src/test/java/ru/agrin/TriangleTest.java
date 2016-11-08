package ru.agrin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testArea() {
	Point a = new Point(0.0, 0.0);
	Point b = new Point(0.0, 2.0);
	Point c = new Point(2.0, 0.0);
	Triangle abc = new Triangle(a, b, c);
	double result = abc.area();
	assertThat(result, is (2.0)); 
    }
}