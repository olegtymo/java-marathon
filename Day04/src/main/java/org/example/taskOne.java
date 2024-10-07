package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer userInput = sc.nextInt();
        Random rand = new Random();
        Integer higherEight = 0;
        int equalToOne = 0;
        int evenNums = 0;
        int oddNums = 0;
        int sum = 0;
        int[] array = new int[userInput];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            higherEight = array[i] > 8 ? higherEight + 1 : higherEight;
            equalToOne = array[i] == 1 ? equalToOne + 1 : equalToOne;
            evenNums = array[i] % 2 == 0 ? evenNums + 1 : evenNums;
            oddNums = array[i] % 2 != 0 ? oddNums + 1 : oddNums;
            sum += array[i];
        }

        System.out.println(Arrays.toString(array) + '\n' + "Length: " + array.length + "\n" + "Higher then eight: " + higherEight + "\n" + "Equal to one: " + equalToOne + "\n" + "Even numbers: " + evenNums + "\n" + "Odd numbers: " + oddNums + "\n" + "Sum: " + sum);
    }
}