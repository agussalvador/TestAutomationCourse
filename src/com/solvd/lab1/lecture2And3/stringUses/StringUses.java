package com.solvd.lab1.lecture2And3.stringUses;

import java.util.Random;

public class StringUses {

    public static void main(String[] args) {
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
        System.out.println("To upper case: " + generatedString1.toUpperCase());
        System.out.println("The string starts with a? " + generatedString1.startsWith("a"));
        System.out.println("They are equals? " + generatedString1.contentEquals(generatedString2));
        System.out.println("Length of string: " + generatedString1.length());
        System.out.println("Concat strings: " + generatedString1.concat(generatedString2));
    }
}
