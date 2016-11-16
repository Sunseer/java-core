package ru.agrin;

public class Square {

    private float a, b, c;

    Square(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float calculate(int x) {
        float y =a*x*x + b*x + c;
        return y;
    }

    public void show (int start, int finish, int step) {
        for (int i = start; i <= finish; i += step) {
            System.out.println("x = " + i + "; y = " + calculate(i));
        }
    }
}