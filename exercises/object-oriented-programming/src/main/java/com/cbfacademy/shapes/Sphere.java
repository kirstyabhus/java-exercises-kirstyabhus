package com.cbfacademy.shapes;

public class Sphere extends Shape {
    double radius;

    public Sphere(double radius) {
        this.shapeName = "Sphere";
        this.radius = radius;
    }

    @Override
    public double area() {
        return (4 * Math.PI * (Math.pow(radius, 2)));
    }

}
