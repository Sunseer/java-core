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
	
        boolean ax = a.x != b.x && a.x != c.x;
        boolean bx = b.x != a.x && b.x != c.x;
        boolean cx = c.x != a.x && c.x != b.x;
        boolean ay = a.y != b.y && a.y != c.y;
        boolean by = b.y != a.y && b.y != c.y;
        boolean cy = c.y != a.y && c.y != b.y;

        if (ax || bx || cx || ay || by || cy || 
	((a.distanceTo(b) < b.distanceTo(c) + c.distanceTo(a)) &&
	(b.distanceTo(c) < c.distanceTo(a) + a.distanceTo(b)) &&
	(c.distanceTo(a) < a.distanceTo(b) + b.distanceTo(c)))) {
            double sp = (a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a)) / 2.0;
            result = Math.sqrt(sp * (sp - a.distanceTo(b)) * (sp - b.distanceTo(c)) * (sp - c.distanceTo(a)));
        }
        return result;
    }
}