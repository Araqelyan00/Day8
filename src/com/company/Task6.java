package com.company;

import java.util.Random;

/*
Generate random integer value, print true if random value
corresponds these conditions, else print false(use boolean primitive
type)
-input number is greater than -1000 and less than 1000
-input number is multiple of 3 or input number is multiple of 5
*/
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt();
        boolean answer ;
        if (number <= -1000 && number >= 1000){
            answer = false;
        } else if (number % 3 != 0 && number % 5 != 0){
            answer = false;
        } else
            answer = true;
        System.out.println(answer);
    }
}
