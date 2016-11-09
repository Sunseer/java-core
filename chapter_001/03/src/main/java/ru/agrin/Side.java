package ru.agrin;

public class Side {
	public double max;
	
	public double maxSide(Triangle triangle) {
		max = triangle.a.distanceTo(triangle.b);
		if (triangle.b.distanceTo(triangle.c) > max)
			max = triangle.b.distanceTo(triangle.c);
		else if (triangle.c.distanceTo(triangle.a) > max)
			max = triangle.c.distanceTo(triangle.a);
		
		return max;		
	}
}