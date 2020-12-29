package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Black", 2016);
        car.info();

        System.out.println(car.yearDifference(2020));
        System.out.println(car.yearDifference(2010));
    }
}