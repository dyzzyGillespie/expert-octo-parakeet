package day11.task1;

import day11.Courier;
import day11.Picker;
import day11.Warehouse;

public class Task1 {


    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(80,warehouse);
        Courier courier = new Courier(100,warehouse);

        courier.doWork();
        picker.doWork();

        businessProcess(picker);
        System.out.println(picker);
        System.out.println(courier);
        System.out.println(warehouse);

        businessProcess(courier);
        System.out.println(courier);
        System.out.println(warehouse);
    }
    public static void businessProcess(Worker worker){
        for (int i=1;i<10000;i++){
            worker.doWork();
        }
        worker.bonus();

    }
}
