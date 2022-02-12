package com.company;

import java.util.Scanner;

/*
The ice cream parlor sells three balls and five balls. Can you buy
exactly k balls of ice cream?
In the cafe they sell an ice-cream with 3 balls and 5 balls.Input K integer
value from console, check if you can buy exactly K balls ice-cream.
*/
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        if (K == 1 || K == 2 || K == 4 || K == 7){
            System.out.println("You can't do it.");
        }else
            System.out.println("You can buy all ice-cream.");
    }
}
