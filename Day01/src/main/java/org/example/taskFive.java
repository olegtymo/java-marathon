package org.example;

public class taskFive {
    public static void main(String[] args) {
        int year = 1980;
        int currentYear = 2024;
        System.out.println("year = " + year);
        for(int i = year; i <= currentYear; i+=4){
                System.out.println("Олимпиада " + i + " года");
        }
    }
}
