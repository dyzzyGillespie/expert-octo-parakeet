package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1=new Airplane("SuperJet",2020,30,45000,0);

        airplane1.setManufacturer("SuperJet");
        airplane1.setYear(2020);
        airplane1.setLength(30);
        airplane1.setWeight(45000);
        airplane1.setFuel(0);
        airplane1.info();
        Airplane airplane2=new Airplane("Ан-124",1987,69,152000,194000);
        airplane2.fillUp(12300);
        airplane2.info();
    }

}
class Airplane{
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;
    void info(){
        System.out.println("Изготовитель: "+manufacturer+","+"год выпуска: "+year+","+"длина: "+length+","+"вес: "+weight+","+"колличество топлива в баке: "+fuel);
    }
    void fillUp(int n){
        int fuel1=n+fuel;
        System.out.println("Колличество топлива в баке самолета "+manufacturer+" стало: "+ fuel1);
    }



    //конструктор
    public Airplane(String manufacturer, int year, int length, int weight, int fuel){
        this.manufacturer=manufacturer;
        this.year=year;
        this.length=length;
        this.weight=weight;
        this.fuel=fuel;
    }



    //сеттеры
    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public void setFuel(int fuel){
        this.fuel=fuel;
    }
    //геттер
    public int getFuel(){
        return fuel;
    }
}

