package com.company;

import java.util.Scanner;

/*
Write a Java program to determine whether an input number is a
multiple of a 5.
*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int source = num % 10;
        if (source == 5 || source == 0){
            System.out.println("Number is multiple of a 5");
        }else
            System.out.println("Number is not multiple of a 5");
    }
}
