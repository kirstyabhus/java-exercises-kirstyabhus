package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list     - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // get length of the list
        int length = list.size();

        // traverse from end of the list to the first element, removing items less than
        // minvalue
        for (int i = length - 1; i >= 0; i--) {
            if (list.get(i) < minValue) {
                list.remove(i);
            }
        }
    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.

        // make a set of the list (since sets can't contain duplicates)
        HashSet<Integer> intSet = new HashSet<>(integers);

        // if set length different to original list then there were duplicates in the
        // original list
        if (intSet.size() == integers.size()) {
            return false;
        }
        return true;
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     *         collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.

        // create sets of the collections, since this will remove the duplicates within
        // the collections
        Set<Integer> set1 = new HashSet<>(ints1);
        Set<Integer> newSet = new HashSet<>(ints2);

        // add one set into the other set (since these are sets it will not contain
        // duplicates)
        newSet.addAll(set1);
        return new ArrayList<>(newSet);
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     *         collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        Set<Integer> set1 = new HashSet<>(ints1);
        Set<Integer> newSet = new HashSet<>(ints2);

        // to retain only the elements that are in the specified colelction
        newSet.retainAll(set1);
        return new ArrayList<>(newSet);
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.

        // return empty string for empty lists
        if (list.size() == 0) {
            return "";
        }

        // create a Map to track string counts
        Map<String, Integer> stringCount = new HashMap<>();

        // iterate through the strings in the list
        for (String x : list) {
            // if the string does not have a count in the map, initialise its count to 0
            stringCount.putIfAbsent(x, 0);
            // get the current count of the string
            int currentValue = stringCount.get(x);
            // increment the count of the string
            stringCount.replace(x, currentValue + 1);
        }

        // initialise maxValue to 0
        int maxValue = 0;
        // store the value counts
        Set<Integer> values = new HashSet<>(stringCount.values());

        // iterate through the count values
        for (int num : values) {
            // find the max value
            if (num > maxValue) {
                maxValue = num;
            }
        }

        // iterate through the keys, and find the key which has a value that is the max
        // value
        for (String key : stringCount.keySet()) {
            if (stringCount.get(key) == maxValue) {
                return key;
            }
        }

        return "";
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
