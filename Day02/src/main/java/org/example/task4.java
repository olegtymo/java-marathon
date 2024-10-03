package org.example;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double y;
        Double x = sc.nextDouble();

        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x < 5 && x > -3) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else {
            y = 420.0;
        }

        System.out.println("Result: " + y);
    }
}
