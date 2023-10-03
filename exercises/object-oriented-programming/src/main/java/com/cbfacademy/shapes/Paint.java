package com.cbfacademy.shapes;

public class Paint {
    double coverage = 100; // represents sq ft per gallon of paint

    /*
     * public Paint(double coverage) {
     * this.coverage = coverage;
     * }
     */

    // returns the no. of gallons of paint needed to paint a given shape
    public double amount(Shape shape) {
        // amount = coverage / shapeArea
        // gallons = (ft^2/gallon) / ft^2
        return coverage / shape.area();
    }
}
