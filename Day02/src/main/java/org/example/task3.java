package org.example;

import java.util.Scanner;

public class task3 {
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

        int counter = numberOne + 1;

        while(numberTwo > counter && numberOne < counter){
            if(counter % 5 == 0 && counter % 10 >= 1){
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}
