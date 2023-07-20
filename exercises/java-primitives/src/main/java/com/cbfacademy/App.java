package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        float x = 5.2f;
        float y = 2.3f;

        // create instance of ArithmeticExercises (in order to use its methods here)
        ArithmeticExercises arithmetic = new ArithmeticExercises();

        // invoke the methods of ArithmeticExercises class
        System.out.println(arithmetic.AddFloat(x, y));
        System.out.println(arithmetic.SubtractFloat(x, y));
        System.out.println(arithmetic.MultiplyFloat(x, y));
        System.out.println(arithmetic.DivideFloat(x, y));

        // create instance of RelationalExercises (in order to use its methods)
        RelationalExercises relational = new RelationalExercises();

        // invoke the methods of RelationalExercises class
        System.out.println(relational.EqualityFloat(x, y));
        System.out.println(relational.LargerFloat(x, y));
        System.out.println(relational.SmallerFloat(x, y));

    }
}
