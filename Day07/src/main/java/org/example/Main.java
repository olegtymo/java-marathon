package org.example;

import org.example.footballTask.Player;

public class Main {
    public static void main(String[] args) {
        // PLane

//        Airplane plane1 = new Airplane("Antonov", 1995, 49, 240);
//        Airplane plane2 = new Airplane("Antonov", 1994, 44, 257);
//
//        Airplane.compareAirplanes(plane1, plane2);


        // Football

        Player player1 = new Player(90);
        Player player2 = new Player(91);
        Player player3 = new Player(92);
        Player.info();

        Player player4 = new Player(93);
        Player player5 = new Player(94);
        Player player6 = new Player(95);
        Player.info();
        Player player7 = new Player(95);
        Player.info();

        for (int i = 0; i < 91; i++) {
            player3.run();
        }
        Player.info();
    }
}