package org.example;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of floors (or 'No' to cancel the input).");

        int userInput = 0;
        boolean isValid = false;

        while (!isValid) {
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("no")) {
                System.out.println("Input canceled.");
                return;
            }

            try {
                userInput = Integer.parseInt(input);
                if (userInput <= 0) {
                    System.out.println("The number of floors cannot be negative or equals 0. Please enter a valid positive integer (or 'No' to cancel the input).");
                } else {
                    isValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer (or 'No' to cancel the input).");
            }
        }

        System.out.println("You entered: " + userInput);

        if (userInput <= 4){
            System.out.println("Малоэтажный дом");
        } else if (userInput <= 8) {
            System.out.println("Среднеэтажный дом");            
        } else {
            System.out.println("Многоэтажный дом");
        }


    }
}