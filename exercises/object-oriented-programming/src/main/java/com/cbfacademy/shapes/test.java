package com.cbfacademy.shapes;

public class test {

    public static void main(String[] args) {
        Sphere s = new Sphere(2.3);
        Cylinder c = new Cylinder(3.4, 4.5);
        Rectangle r = new Rectangle(3.0, 5.0);

        System.out.println(s.area()); // should be
        System.out.println(c.area()); // should be
        System.out.println(r.area()); // should be 15

        System.out.println(r.toString());
    }
}
