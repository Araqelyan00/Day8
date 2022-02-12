package com.company;

import java.util.Random;

/*
Generate and print random integer number between 2 to 7(not using
bound)
*/
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt() % 6;
        if (num < 0){
            num = num * (-1);
        }
        num = num + 2;

        System.out.println(num);
    }
}
