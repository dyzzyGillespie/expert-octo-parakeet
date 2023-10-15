package day6;
public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Lada");
        car1.setColor("red");
        car1.setYear(1970);
        car1.info();
        car1.yearDifference(2023);
    }
}

class Car {
    private String model;
    private String color;
    private int year;

    void yearDifference(int inputYear) {
        int age = inputYear - year;
        System.out.println(age);
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
