package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha", "Red", 2020);

        System.out.printf("Модель: %s, цвет: %s, год выпуска: %d\n", motorbike.getModel(), motorbike.getColor(), motorbike.getYear());
    }
}

class Motorbike{
    private String model;
    private String color;
    private int year;

    Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}