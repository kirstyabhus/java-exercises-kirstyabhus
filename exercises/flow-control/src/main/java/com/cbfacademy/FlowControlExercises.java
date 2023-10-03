package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        // it creates a list where for each element of the input list ${numbers}
        List<String> fbArrayList = new ArrayList<>();

        for (Integer x : numbers) {
            if ((x % 3 == 0) && (x % 5 == 0)) {
                // - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the
                // list
                fbArrayList.add("FizzBuzz");
            } else if ((x % 3 == 0)) {
                // - if the ${element} is divisible by 3, it adds “Fizz” to the list
                fbArrayList.add("Fizz");
            } else if ((x % 5 == 0)) {
                // - if the ${element} is divisible by 5, it adds “Buzz” to the list
                fbArrayList.add("Buzz");
            } else {
                // - it adds the element to the list in any other case
                fbArrayList.add(x.toString());
            }
        }
        // - it returns the constructed list
        return fbArrayList;

    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        // - it returns the month corresponding to the input ${number}
        // - if the ${number} is invalid, the method should return "Invalid month
        // number"

        // create map
        Map<Integer, String> monthMap = new HashMap<Integer, String>();

        // put month number and name pairs
        monthMap.put(1, "January");
        monthMap.put(2, "February");
        monthMap.put(3, "March");
        monthMap.put(4, "April");
        monthMap.put(5, "May");
        monthMap.put(6, "June");
        monthMap.put(7, "July");
        monthMap.put(8, "August");
        monthMap.put(9, "September");
        monthMap.put(10, "October");
        monthMap.put(11, "November");
        monthMap.put(12, "December");

        // return month name, or message if given number no avaliable
        return monthMap.getOrDefault(number, "Invalid month number");
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        // - creates and initialises a list of 100 numbers - from 1 to 100
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        Integer evenSum = 0;
        Integer oddSum = 0;

        for (Integer x : numbers) {
            if (x % 2 == 0) {
                evenSum += x;
            } else {
                oddSum += x;
            }
        }

        Map<String, Integer> sums = new HashMap<String, Integer>();
        // - determines the sum of all the even numbers in the list
        sums.put("SumOfEvens", evenSum);
        sums.put("SumOfOdds", oddSum);
        // - determines the sum of all the odd numbers in the list
        // - returns a map with two entries:
        // {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        return sums;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        // - it takes an array list of integers
        // - it returns the list in reverse order
        ArrayList<Integer> newArray = new ArrayList<>();

        int lengthA = newArray.len

        for (int i = 0; i <= newArray.length)
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
