package day11.task1;

public class Warehouse {
    private int id;
    private int countPickedOrders;
    private int countDeliveredOrders;

    public Warehouse(int id) {
        this.id = id;
        countDeliveredOrders = 0;
        countDeliveredOrders = 0;
    }

    public int getId(){
        return id;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Склад N" + id +" - собранных заказов: " + countPickedOrders +
                ", доставленных заказов: " + countDeliveredOrders;
    }
}