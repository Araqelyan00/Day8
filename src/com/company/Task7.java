package com.company;

import java.util.Scanner;

/*
Write a Java program that keeps a number from the user and generates
an integer between 1 and 7 and displays the name of the weekday.
*/
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = number % 7 + 1;
        if (n == 1)
            System.out.println("Monday");
        else if (n == 2)
            System.out.println("Tuesday");
        else if (n == 3)
            System.out.println("Wednesday");
        else if (n == 4)
            System.out.println("Thursday");
        else if (n == 5)
            System.out.println("Friday");
        else if (n == 6)
            System.out.println("Saturday");
        else
            System.out.println("Sunday");
    }
    }

