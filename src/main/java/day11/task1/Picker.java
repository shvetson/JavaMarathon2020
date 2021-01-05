package day11.task1;

public class Picker implements Worker {
    private Warehouse warehouse;
    private int salary;
    private boolean isPayed;
    private final int SALARY_WORK = 80;
    private final int LIMIT_WORK = 10_000;
    private final int BONUS = 70_000;

    public Picker(Warehouse warehouse) {
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
        return "Сборщик (склад N" + warehouse.getId() + ") - з/п: " + salary + ", выплата бонуса: " + isPayed;
    }

    @Override
    public void doWork() {
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
        salary += SALARY_WORK;
    }

    @Override
    public void bonus() {
        System.out.print("Сборщик (склад N" + warehouse.getId() + "). ");
        if (warehouse.getCountPickedOrders() < LIMIT_WORK) {
            System.out.println("Бонус пока не доступен.");
        } else if (!isPayed) {
            salary = salary + BONUS;
            isPayed = true;
            System.out.println("Бонус начислен.");
        } else {
            System.out.println("Бонус уже выплачен.");
        }
    }
}