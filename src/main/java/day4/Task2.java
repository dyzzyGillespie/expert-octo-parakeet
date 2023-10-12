package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        Random rnd = new Random();

//присваиваю рандомные числа массиву
        for (int i : mass) {
            mass[i] = rnd.nextInt(100001);
            System.out.println(mass[i]);

        }//вычисляю минимальное число
        int min = mass[0];
        for (int i : mass) {
            if (i < min) {
                min = mass[i];

            }
        }
        System.out.println("наименьший элемент массива " + min);



        //вычисляю максимальное число
        int max = mass[0];
        for (int i : mass) {
            if (i > max) {
                max = mass[i];
            }
        }
        System.out.println("наибольший элемент массива " + max);

        //вычисляю все числа с 0 на конце
        int a = 0;
        for (int i : mass) {
            if (i % 10 == 0) ;
            a++;
        }
        System.out.println("количество элементов массива, оканчивающихся на 0\n " + a);
        int sum = 0;
        for(int i:mass){
            if (i%10==0);
            sum++;
    }
        System.out.println("сумму элементов массива, оканчивающихся на 0 "+sum);


    }





    }



















