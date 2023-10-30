package day15;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Task2 {
    public Task2() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        createResult();
        File file2 = new File("file2");
        System.out.println(printResult(file2));
    }

    public static void createResult() throws FileNotFoundException {
        File file1 = new File("file1");
        File file2 = new File("file2");
        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        Scanner scanner = new Scanner(file1);
        for (int s = 1; s <= 1000; s++) {
            if (s % 20 == 0) {
                pw1.println();
            }
            pw1.print((int) (Math.random() * 100) + " ");
        }
        pw1.close();
        while (scanner.hasNextLine()) {
            String[] num = scanner.nextLine().split(" ");
            int sum = 0;
            for (String number : num) {
                sum += Integer.parseInt(number);
            }
            pw2.printf("%.3f%n", ((float) sum / num.length));
        }
        pw2.close();
    }
    public static int printResult(File file) throws FileNotFoundException, ParseException {
        Scanner scanner2 = new Scanner(file);
        double sum = 0;
        while (scanner2.hasNextLine()) {
            NumberFormat format = NumberFormat.getInstance();
            Number number = format.parse(scanner2.nextLine());
            sum += number.doubleValue();
            }
        return (int) sum;
        }
    }















