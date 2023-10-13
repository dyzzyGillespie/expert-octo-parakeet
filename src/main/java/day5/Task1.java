package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setModel("Lada");
        car1.setColor("red");
        car1.setYear(1970);
        System.out.println("Хочу купить "+car1.getModel());
        System.out.println("Не старше "+car1.getYear());
        System.out.println("Цвет "+car1.getColor());

    }
}
class Car{
    private String model;
    private String color;
    private int year;

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
