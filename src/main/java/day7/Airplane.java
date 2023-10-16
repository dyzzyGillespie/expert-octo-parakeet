package day7;

public class Airplane {
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
    public int getLength(){
        return length;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public static void compareAirplanes(Airplane air1, Airplane air2){
        if(air1.getLength()>air2.getLength()) {
            System.out.println("Самолет " + air1.getManufacturer() + " длиннее.");
        }
        else if(air1.getLength()>air2.getLength()) {
            System.out.println("Самолет " + air2.getManufacturer() + " длиннее.");
        }else {
            System.out.println("Самолёты одинаковой длинны.");

        }
    }
}

