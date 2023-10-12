package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] mass = new int[12][8];
        Random rnd = new Random();
        int i=0;
        int j=0;

        for (i = 0; i < 12; i++)
            for (j = 0; j < 8; j++) {
                mass[i][j] = rnd.nextInt(51);
                System.out.println(mass[i][j]);

            }
    }

}



