package day11;

import day11.task1.Worker;

public class Courier implements Worker {
   private int salary=100;

    private int isPayed;
    private Warehouse warehouse;


    public Courier(int salary,Warehouse warehouse) {
        this.salary = salary;
        this.warehouse=warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
    public void doWork(){
        {
        salary+=salary;
        warehouse.getCountDeliveredOrders();
        }


        }
    public void bonus(){
        if (warehouse.getCountDeliveredOrders()<10000){
                System.out.println("Бонус пока не доступен");
            }else if(warehouse.getCountPickedOrders()>10000) {
                System.out.println("Бонус уже был выплачен");
            }else {
                isPayed+=isPayed;
            }
    }

    }


