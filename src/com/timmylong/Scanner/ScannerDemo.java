package com.timmylong.Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input and add the numbers together

        String userInput1 = "Enter your first number: ";
        String userInput2 = "Enter your second number: ";

        System.out.println(userInput1);
        int num1 = sc.nextInt();
        
        System.out.println(userInput2);
        int num2 = sc.nextInt();

        System.out.println("Your answer: " + (num1 + num2));

        sc.close();
    }
}
