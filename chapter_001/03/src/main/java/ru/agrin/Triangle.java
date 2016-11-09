package ru.agrin;

public class Triangle {
    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        //calculate the triangle area
        double result = 0.0;
	
        if ((a.distanceTo(b) < b.distanceTo(c) + c.distanceTo(a)) &&
	(b.distanceTo(c) < c.distanceTo(a) + a.distanceTo(b)) &&
	(c.distanceTo(a) < a.distanceTo(b) + b.distanceTo(c))) {
            double sp = (a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a)) / 2.0;
            result = Math.sqrt(sp * (sp - a.distanceTo(b)) * (sp - b.distanceTo(c)) * (sp - c.distanceTo(a)));
        }
        return result;
    }
}