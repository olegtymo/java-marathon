package org.example;

import java.util.Arrays;
import java.util.Random;

public class taskTwo {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        int maxNum = 0;
        int amountEqualToTen = 0;
        int sumEqualToTen = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        int minNum = array[0];

        for (int number : array) {

            if(number > maxNum){
                maxNum = number;
            }

            if(minNum > number){
                minNum = number;
            }

            if(number%10 == 0){
                amountEqualToTen++;
                sumEqualToTen += number;
            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println("Max Num: " + maxNum);
        System.out.println("Min Num: " + minNum);
        System.out.println("Amount Equal to ten: " + amountEqualToTen);
        System.out.println("Sum Equal to ten: " + sumEqualToTen);
    }
}
