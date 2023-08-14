package com.cbfacademy.shapes;

public class PaintShapes {
    public static void main(String[] args) {

        // create instances of the shapes
        Rectangle rectangle = new Rectangle(35, 20);
        Sphere ball = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        // create an instance of the paint class in order to use the "amount" method
        Paint paint = new Paint();

        // outprint the gallons of paint needed
        System.out.println(paint.amount(rectangle));
        System.out.println(paint.amount(ball));
        System.out.println(paint.amount(tank));
    }
}
