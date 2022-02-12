package com.company;

import java.util.Scanner;

/*
Input int values a and b from console
- if one of them is multiple of 7, and both positive, and a
greater than b, print all odd values between them
- else print all even values between them
*/
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        if (numberA % 7 == 0 && numberA > 0 && numberB >= 0 && numberA > numberB){
            for (int i = numberB; i < numberA; i++){
                if (i % 2 == 1){
                    System.out.println(i);
                }
            }
        }else if (numberB % 7 == 0 && numberA > 0 && numberB >= 0 && numberA > numberB){
            for (int i =numberB; i < numberA; i++){
                if (i % 2 == 1){
                    System.out.println(i);
                }
            }
        }else {
            int min ;
            int max;
            if (numberA > numberB == true) {
                min = numberB;
                max = numberA;
            }else{
                min = numberA;
                max = numberB;
                for (int i = min; i < max; i++) {
                    if (i % 2 == 0){
                        System.out.println(i);
                    }
                }
            }
            }
    }
}
