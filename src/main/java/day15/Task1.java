package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers");
        printResult(file);

    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");


        int sum = 0;
        for (String number : numbers) {

            sum += Integer.parseInt(number);
        }
        System.out.println(sum / numbers.length);
        float f = (float) sum;

        System.out.printf("%.3f%n",(f / numbers.length));
    }
}