package day11;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;


    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
    public void pickedOrders(){
        countPickedOrders++;
    }
    public void deliveredOrders(){
        countDeliveredOrders++;
    }

}
