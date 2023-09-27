package com.cbfacademy;

public class App {

    public int binarySearch(int target) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == numbers[mid]) {
                return mid;
            } else if (target > numbers[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        App binarySearch = new App();
        System.out.println(binarySearch.binarySearch(2));

    }
}
