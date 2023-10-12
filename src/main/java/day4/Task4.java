package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[]mass = new int[100];
        Random rnd= new Random();

        for(int i:mass){
            mass[i]=rnd.nextInt(10001);
            System.out.println(mass[i]);
        }

    }
}
