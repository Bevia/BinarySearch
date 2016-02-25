package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

        /**
         *  Lets go over sorting and binary search in Array and ArrayList --->
         */

public class Main {

    public static void main(String[] args) {

        /**
         *  First, create an array of states:
         */
        String[] states = {"Connecticut", "California", "Arizona", "New York", "Florida"};

        /**
         * Now create a ListArray
         */
        List<String> firstList = new ArrayList<>();

        /**
         * To use binary search you must sort the Array
         */
        System.out.println("\n" + "Sorted states: ");
        Arrays.sort(states); //Sort the Array
        for (String s:
                states) {
            firstList.add(s); //add the states to the ListArray
            System.out.println(s);
        }

        /**
         * use the Binary Search Algorithm (on the Array):
         */
        int searchState = Arrays.binarySearch(states, "Arizona");

        /**
         * it will print out 0 as the index place holder for Arizona
         */
        System.out.println("the index of the element Arizona is: " + searchState);

        /**
         * Lets add a new state to ListArray
         */
        firstList.add("Arkansas");

        /**
         *  sort the ArrayList
         *  Notice the difference between Arrays and Collections. Array list uses the Collections method sort while
         *  Array uses the Arrays method sort!
         */
        Collections.sort(firstList);
        //Collections.sort(firstList, Collections.reverseOrder());//sort the ArrayList in reverse order

        /**
                To use binary search you must sort the Array
         */
        System.out.println("\n" + "Add new state: ");
        for (String allstates:
                firstList) {
            System.out.println(allstates);
        }

        /**
         * use the Binary Search Algorithm (on the on the ListArray):
         */
        int searchMoreState = Collections.binarySearch(firstList, "California");

        /**
         * it will print out 0 as the index place holder for California
         */
        System.out.println("the index of the element California is: " + searchMoreState);

        /**
         * converting the ListArray back to an Array
         */
        states = firstList.toArray(new String [firstList.size()]);
        System.out.println("\n" + "my new Array of states: ");
        for (String newArrayOfStates:
             states) {
            System.out.println(newArrayOfStates);
        }
    }
}
