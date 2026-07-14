package com.timmylong.formatting;

public class formatting {
    public static void main(String[] args) {

        // learning the printf() method

        // %d is for integers

        System.out.printf("The sum of %d and %d is %d\n", 17, 13, 30);

        // %f is for floating integers

        System.out.printf("Display a number: %f\n", 47.26);

        // to clean up with precision add specified number of decimal spaces before f

        System.out.printf("Display a number: %.2f\n", 47.26);

        // %c is for characters
        // %s is for strings

        char abbr = 'O';
        String element = "Oxygen";

        System.out.printf("%c stands for %s\n", abbr, element);

        // the string.format() method

        char initial = 'T';
        String lastName = "Long";
        int age = 32;
        double yearsPlayed = 20.5;

        String details = String.format(
                "My name is %c. %s. %nI am %d years old. %nI have played guitar for %.1f years.",
                initial, lastName, age, yearsPlayed
        );

        System.out.println(details);
    }
}
