package com.company;

import java.util.Scanner;

/*
Write a Java program that takes a year from the user and print whether
that year is a leap year or not.
*/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 != 0){
            System.out.println("Not a Leap Year.");
        } else if (year % 100 != 0){
            System.out.println("Not a Leap Year.");
        } else if (year % 400 != 0){
            System.out.println("Not a Leap Year.");
        } else
            System.out.println("Leap Year");
    }
}
