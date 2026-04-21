package com.a24100280.teamrackett;

public class Circle extends Shape {
    double radius;

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
