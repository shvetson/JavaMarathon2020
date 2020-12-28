package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Ford");
        car.setColor("Black");
        car.setYear(2020);

        System.out.printf("Модель: %s, цвет: %s, год выпуска: %d\n", car.getModel(), car.getColor(), car.getYear());
    }
}

class Car{
    private String model;
    private String color;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}