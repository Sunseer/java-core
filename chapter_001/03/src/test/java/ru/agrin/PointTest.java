package ru.agrin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void testDistanceTo() {
	Point first = new Point(1.0, 1.0);
	Point second = new Point(1.0, 2.0);
	double result = first.distanceTo(second);
	assertThat(result, is (1.0)); 
    }
}