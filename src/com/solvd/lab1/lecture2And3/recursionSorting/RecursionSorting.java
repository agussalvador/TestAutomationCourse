package com.solvd.lab1.lecture2And3.recursionSorting;

import java.util.Random;
public class RecursionSorting {

    public static void main(String[] args) {

        System.out.println("Task 4 recursion");
        //Generate a random array
        Random random = new Random();
        int[] numbers = new int[5];
        System.out.println("Unsorted array");
        System.out.println("----------");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(); // storing random integers in an array
            System.out.println(numbers[i]);
        }

        //Calling sort function
        sortArray(numbers,numbers.length,0);

        System.out.println("Sorted array");
        System.out.println("----------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    static int minIndex(int array[], int i, int j)
    {
        //Halting Condition
        if (i == j)
            return i;

        // Find minimum of remaining elements
        int min = minIndex(array, i+1, j);

        // Return minimum of current and remaining. ternary if
        return (array[i] < array[min])? i : min;
    }

    // Recursive selection sort. n is size of a[] and index
    // is index of starting element.
    static void sortArray(int array[], int length, int index)
    {

        // Return when starting and size are same Halting Condition
        if (index == length)
            return;

        // calling minimum index function for minimum index
        int min = minIndex(array, index, length-1);

        // Swapping when index nd minimum index are not same
        if (min != index){
            // swap positions
            int temp = array[min];
            array[min] = array[index];
            array[index] = temp;
        }
        // Recursively calling selection sort function
        sortArray(array, length, index + 1);
    }
}
