package org.example;

import java.util.Random;

public class taskFour {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        int maxSum = 0;
        int indx = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + "\t");
        }

        System.out.println("\n");

        for (int i = 1; i < array.length - 1; i++) {
            int sum = 0;
            sum = array[i - 1] + array[i] + array[i + 1];
            if (sum >= maxSum) {
                maxSum = sum;
                indx = i - 1;
            }
        }
        System.out.println("Max sum is " + maxSum + "\n" + "First integer with index: " + indx);
    }
}
