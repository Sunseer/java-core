package ru.agrin.triangle;

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
	double ab = a.distanceTo(b);
	double bc = b.distanceTo(c);
	double ca = c.distanceTo(a);

        if ((ab < bc + ca) && (bc < ca + ab) && (ca < ab + bc)) {
            double sp = (ab + bc + ca) / 2.0;
            result = Math.sqrt(sp * (sp - ab) * (sp - bc) * (sp - ca));
        }
        return result;
    }
}