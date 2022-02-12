package com.company;

import java.util.Scanner;

/*
13.Given 3 numbers, print count of numbers that equals to each
other.(Input numbers from console)
*/
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int count = 1;
        if (num1 == num2 && num1 == num3 && num2 == num3) {
            count = count + 2;
            System.out.println(count);
        }else if(num1 == num2 || num1 == num3 || num2 == num3){
            count++;
            System.out.println(count);

        }else {
            System.out.println("no equal numbers");
        }
    }
}
