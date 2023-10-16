package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int min = 90;
        Player p1 = new Player(rnd.nextInt(11) + min);
        Player p2 = new Player(rnd.nextInt(11) + min);
        Player p3 = new Player(rnd.nextInt(11) + min);
        Player p4 = new Player(rnd.nextInt(11) + min);
        Player p5 = new Player(rnd.nextInt(11) + min);
        Player p6 = new Player(rnd.nextInt(11) + min);
p1.info();
        System.out.println(p1.getStamina());
p1.run();
        System.out.println(p1.getStamina());
    }
}

class Player {
    private int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (this.stamina > MIN_STAMINA) {
            stamina--;
        } else {
            countPlayers--;
        }

    }

    public void info() {

        if (countPlayers < 6) {
            System.out.println("Игроков не хватает "+" осталось "+(6-countPlayers)+" свободное место");

        } else {
            System.out.println("Команда полная");
        }
    }
}










