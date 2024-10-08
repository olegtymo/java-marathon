package org.example;

import java.util.Scanner;

public class taskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double divisor;
        Double dividend;
        Double result;
        int counter = 0;

        while (counter < 5) {

            System.out.println("Please enter a divisor");
            divisor = sc.nextDouble();
            System.out.println("Please enter a dividend");
            dividend = sc.nextDouble();

            if (dividend == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            result = divisor / dividend;

            System.out.println("You`ve entered: " + divisor + ", " + dividend + ". The result is " + result);
            System.out.println(4 - counter + " attempts left");
            counter++;
        }
    }
}
