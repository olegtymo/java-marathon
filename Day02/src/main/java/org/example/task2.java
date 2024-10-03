package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean isFirstInputValid = false;
        Boolean isSecondInputValid = false;

        int numberOne = 0;
        int numberTwo = 0;

        while (!isFirstInputValid) {
            System.out.println("Enter the first integer:");
            try {
                numberOne = Integer.parseInt(sc.nextLine());
                isFirstInputValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. First value is not an integer.");
            }
        }

        while (!isSecondInputValid) {
            System.out.println("Enter the second integer:");
            try {
                numberTwo = Integer.parseInt(sc.nextLine());
                isSecondInputValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Second value is not an integer.");
            }
        }
        System.out.println("You entered: " + numberOne + " and " + numberTwo);
        for(int i = numberOne+1; i<numberTwo; i++){
            if(i % 5 == 0 && i % 10 >= 1){
                System.out.print(i + " ");

            }
        }
    }
}
