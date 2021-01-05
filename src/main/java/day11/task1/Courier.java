package day11.task1;

public class Courier implements Worker {
    private Warehouse warehouse;
    private int salary;
    private boolean isPayed;
    private final int SALARY_WORK = 100;
    private final int LIMIT_WORK = 10_000;
    private final int BONUS = 50_000;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Курьер (склад N" + warehouse.getId() + ") - з/п: " + salary + ", выплата бонуса: " + isPayed;
    }

    @Override
    public void doWork() {
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
        salary += SALARY_WORK;    }

    @Override
    public void bonus() {
        System.out.print("Курьер (склад N" + warehouse.getId() + "). ");
        if (warehouse.getCountDeliveredOrders() < LIMIT_WORK) {
            System.out.println("Бонус пока не доступен");
        } else if (!isPayed) {
            salary = salary + BONUS;
            isPayed = true;
            System.out.println("Бонус начислен");
        } else {
            System.out.println("Бонус уже выплачен");
        }
    }
}
