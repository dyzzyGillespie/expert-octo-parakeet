package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int i = 0;
        while (i <= 5) {
            System.out.println("Введите два числа");
            i++;

            if(b==0) {
                System.out.println("Деление на 0");
                continue;

            }
            System.out.println(a/b);


    }
}
}
