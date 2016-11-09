package ru.agrin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class SideTest {

    @Test
    public void testMaxSide() {
	Point a = new Point(0.0, 0.0);
	Point b = new Point(0.0, 2.0);
	Point c = new Point(2.0, 0.0);
	Triangle abc = new Triangle(a, b, c);
	Side side = new Side();
	double result = side.maxSide(abc);
	assertThat(result, is(closeTo(2.83, 0.01))); 
    }
}