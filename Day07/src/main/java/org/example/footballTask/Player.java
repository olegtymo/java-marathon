package org.example.footballTask;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (Player.countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (this.stamina == 0)
            return;

        stamina--;

        if (stamina == 0) {
            countPlayers--;
        }

    }

    static public void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
