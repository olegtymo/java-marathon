package org.example;

public class taskFour {
    public static void main(String[] args) {
        int year = 1980;
        int currentYear = 2024;
        System.out.println("year = " + year);
        while (year <= currentYear){
            System.out.println("Олимпиада " + year + " года");
            year+=4;
        }
    }
}
