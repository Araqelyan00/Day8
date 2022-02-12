package com.company;

import java.util.Scanner;

/*
14.Given 3 real numbers a , b , c .FInd all decisions for
ax2 + bx + c = 0.Print all decisions, if there is not a
decision ,print “Can't be”.
*/
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - (4 * a * c);

        if (d < 0){
            System.out.println("Can't be.");
        }else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);


            if (d == 0) {
                System.out.println("x1 = x2 = " + x1);
            } else
                System.out.println("x1 = " + x1 + "x2 = " + x2);
        }
    }
}
