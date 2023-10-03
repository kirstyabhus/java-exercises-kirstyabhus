package com.cbfacademy;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        double[] doubleArray = new double[5];

        doubleArray[0] = 0.1;
        doubleArray[1] = 0.2f;
        doubleArray[2] = 0.3f;
        doubleArray[3] = 0.4f;
        doubleArray[4] = 0.5f;

        float[] floatArray = { 1.6f, 1.6f, 1.6f, 1.6f, 1.6f, 1.6f, 1.6f, 1.6f, 1.6f, 1.6f, 1.6f, 1.6f };

        boolean[] booleanArray = { true, false, true, false, true, false };

        Object[] arrayObject = { intArray, floatArray, doubleArray, booleanArray };
        System.out.println(Arrays.deepToString(arrayObject));

    }
}
