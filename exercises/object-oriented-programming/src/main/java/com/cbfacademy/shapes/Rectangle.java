package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.shapeName = "Rectangle";
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
