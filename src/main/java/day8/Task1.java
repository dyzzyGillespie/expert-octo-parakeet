package day8;

public class Task1 {
    public static void main(String[] args) {
String str = "";

        long startTime = System.currentTimeMillis();
        for (int i=1;i<=20000;i++){
            str = str + i+" ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы первого метода, в мс.:" + (stopTime - startTime));

StringBuilder sb = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i=1;i<=20000;i++){
            sb.append(i).append(" ");
        }
        stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы второго метода, в мс.:" + (stopTime - startTime));



    }
}
