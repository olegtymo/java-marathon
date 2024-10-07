package org.example;

import java.util.Random;

public class taskThree {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(50);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int maxSum = 0;
        int maxInd = 0;

        for (int i = 0; i < array.length; i++) {
            int res = 0;
            for (int j = 0; j < array[i].length; j++) {
                res += array[i][j];
            }
            System.out.println("Row" + i + ": " + res + "\t");
            if (res >= maxSum) {
                maxSum = res;
                maxInd = i;
            }
        }
        System.out.println();
        System.out.println("Max Sum Row Index: " + maxInd);
    }
}
