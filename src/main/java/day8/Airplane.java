package day8;

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
            System.err.println("Ошибка. Дозаправка невозможна");
        } else {
            fuel = fuel + n;
            System.out.println("Самолет дозаправлен");
            ;
        }
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        double differenceLength = airplane1.length - airplane2.length;
        if (differenceLength == 0) {
            System.out.println("Длины самолетов одинаковые.\n");
        } else if (differenceLength > 0) {
            System.out.printf("Самолет %s длиннее самолета %s.\n", airplane1.producer, airplane2.producer);
        } else {
            System.out.printf("Самолет %s длиннее самолета %s.\n", airplane2.producer, airplane1.producer);
        }
    }

    public String toString() {
        return "Изготовитель: " + producer + ", " +
                "год выпуска: " + year + ", " +
                "длина: " + length + "м, " +
                "вес: " + weight + "тн";
    }
}