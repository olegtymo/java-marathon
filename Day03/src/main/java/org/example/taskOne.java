package org.example;

import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        while(!userInput.equalsIgnoreCase("stop")){
            switch (userInput){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;

                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;

                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;

                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;

                default:
                    System.out.println("Неизвестная страна");
            }
            userInput = sc.nextLine();
        }

    }
}