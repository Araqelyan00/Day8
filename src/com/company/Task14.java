package com.company;

import java.util.Scanner;

/*
15.Given 3 integer values arrange them in non-decreasing order.
a <= b <= c.
*/
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 >= num2 && num2 >= num3){
            System.out.println(num3 + " " + num2 + " " + num1);
        } else if (num1 >= num3 && num3 >= num2){
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num2 >= num1 && num1 >= num3){
            System.out.println(num3 + " " + num1 + " " + num2);
        } else if (num2 >= num3 && num3 >= num1){
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num3 >= num1 && num1 >= num2){
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num3 >= num2 && num2 >= num1){
            System.out.println(num1 + " " + num2 + " " + num3);
        }
    }
}
