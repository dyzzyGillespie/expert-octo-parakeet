package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike1=new Motorbike("Honda", "black", 2020);
        System.out.println("Хочу купить "+bike1.getModel());
        System.out.println("Не старше "+bike1.getYear());
        System.out.println("Цвет "+bike1.getColor());
    }
}
class Motorbike{
    private String model;
    private String color;
    private int year;



    public Motorbike(String model, String color, int year){
        System.out.println("Хороший мотоцикл!");
        this.model=model;
        this.color=color;
        this.year=year;
    }

    public void setModel(String model){
        this.model=model;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
}
