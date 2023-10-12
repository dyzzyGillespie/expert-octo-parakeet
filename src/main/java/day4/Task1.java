package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        Random random = new Random();

        for (int k : mass) {
            k= random.nextInt(10) + 1;
        }
        System.out.println(mass.length);
        int a = 0;
        for (int i : mass) {
            if (i > 8) ;
            a++;
        }
            System.out.println("Количестве чисел больше 8 " + a);

        int b = 0;
        for (int i1 : mass) {
            if (i1 == 1) ;
            b++;
        }
        System.out.println("Количестве чисел равных 1 " + b);

        int c = 0;
        for (int i2 : mass) {
            if (i2 % 2 == 0) ;
            c++;
        }
        System.out.println("Количестве четных чисел " + c);

        int d = 0;
        for (int i3 : mass) {
            if (i3 % 2 != 0) ;
            d++;
        }
        System.out.println("Количестве нечетных чисел " + d);

        int sum = 0;
        for (int e : mass) {
            sum = sum + e;
        }
        System.out.println("Сумме всех элементов массива " + sum);



    }
}

