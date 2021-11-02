package com.solvd.lab1.lecture2.runner;

import com.solvd.lab1.lecture2.vehicles.Car;
import com.solvd.lab1.lecture2.vehicles.Motorbike;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("AA123AA","Ford",145,"Diesel");
        Car car2 = new Car("AJ987FR","Tesla",220,"Hybrid");
        Car car3 = new Car("AA123AA","Fiat",120,"Diesel");

        Motorbike moto1 = new Motorbike("BB456BB","Suzuki",130,"Cross");

        System.out.println("-------------------------------");
        System.out.println("Task 1");
        moto1.run();
        moto1.wheelie();


        //Task 2 use toString, equals and hashcode
        System.out.println("-------------------------------");
        System.out.println("Task 2 to string, equals and hashcode.");
        System.out.println(moto1.toString());

        System.out.println("Car1 its equals to car2? " +car1.equals(car2));
        System.out.println("Car1 its equals to car3? " +car1.equals(car3));

        System.out.println("Car1 hashcode: "+car1.hashCode() + " isn't equals to car2 hashcode: " +car2.hashCode());
        System.out.println("Car1 hashcode: "+car1.hashCode() + " is equals to car3 hashcode: " +car3.hashCode());


        //Task 3 random strings
        //Random generate String
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString1 = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        String generatedString2 = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        //Two random strings
        System.out.println("-------------------------------");
        System.out.println("Random strings Task 3");
        System.out.println(generatedString1);
        System.out.println(generatedString2);

        //5 String class methods
        System.out.println("To upper case: " +generatedString1.toUpperCase());
        System.out.println("The string starts with a? " +generatedString1.startsWith("a"));
        System.out.println("They are equals? " +generatedString1.contentEquals(generatedString2));
        System.out.println("Length of string: " +generatedString1.length());
        System.out.println("Concat strings: " +generatedString1.concat(generatedString2));


        System.out.println("-------------------------------");
        System.out.println("Task 4 recursion");
        //Generate a random array
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
