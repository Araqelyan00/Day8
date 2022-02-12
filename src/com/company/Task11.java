package com.company;

import java.util.Scanner;

/*
Given 3 positive numbers different from 0, Determine if there is
a non-degenerate triangle with such sides.
- Input numbers from console
*/
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("There is a non-degenerate triangle");
        }else
            System.out.println("There is not a non-degenerate triangle");
    }
}
