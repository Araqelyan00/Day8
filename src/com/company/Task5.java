package com.company;

import java.util.Scanner;

/*
Take three numbers from the user and print the greatest number.
*/
public class Task5 {
    public static void main(String[] args) {
        System.out.print("Please input 3 numbers");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 >= num2 && num1 >= num3){
            System.out.println("The greatest number is " + num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("The greatest number is " + num2);
        } else
            System.out.println("The greatest number is " + num3);
    }
}
