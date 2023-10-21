package day11;

import day11.task1.Worker;

public class Picker implements Worker {
    private int salary=80;
    private int isPayed;
    private Warehouse warehouse;




    public Picker(int salary,Warehouse warehouse) {
        this.salary = salary;
        this.warehouse=warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed='" + isPayed + '\'' +
                '}';
    }

    public void doWork() {
        salary += salary;
        warehouse.getCountPickedOrders();
        }


    public void bonus() {
        if (warehouse.getCountPickedOrders()<10000){
            System.out.println("Бонус пока не доступен");
        }else if(warehouse.getCountPickedOrders()>10000) {
            System.out.println("Бонус уже был выплачен");
        }else {
            isPayed+=isPayed;
        }
    }
}


