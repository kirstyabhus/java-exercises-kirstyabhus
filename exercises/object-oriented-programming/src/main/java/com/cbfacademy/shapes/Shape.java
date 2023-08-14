package com.cbfacademy.shapes;

public abstract class Shape {
    // an instance variable shapeName of type String
    String shapeName;

    // an abstract method area()
    public abstract double area();

    // a toString method that returns the name of the shape
    public String toString() {
        return shapeName;
    }
}
