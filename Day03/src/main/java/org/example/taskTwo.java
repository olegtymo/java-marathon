package org.example;

import java.util.Scanner;

public class taskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double result;

        while (true) {
            System.out.println("Please enter a divisor");
            Double divisor = sc.nextDouble();
            System.out.println("Please enter a dividend");
            Double dividend = sc.nextDouble();

            if (dividend == 0) {
                return;
            }

            result = divisor / dividend;

            System.out.println("You`ve entered: " + divisor + ", " + dividend + ". The result is " + result );
        }
    }
}
