package day6;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;
    private int maxValueFuel = 20000;

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %.1f м, вес: %.1f тн, количество топлива в баке: %d л\n", producer, year, length, weight, fuel);
    }

    public void fillUp(int n) {
        if ((n < 0) || (fuel + n) > maxValueFuel) {
            System.err.println("Ошибка. Заправка невозможна");
        } else {
            fuel = n;
            System.out.println("Самолет заправлен");;
        }
    }
}