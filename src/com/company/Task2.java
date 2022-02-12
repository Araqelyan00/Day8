package com.company;

import java.util.Scanner;

/*
Write a Java program to determine whether an input number is an
even number.
*/
public class Task2 {
    public static void main(String[] args) {
        System.out.print("Please input a number: num = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Number is even.");
        }else
            System.out.println("Number is odd.");
    }
}
