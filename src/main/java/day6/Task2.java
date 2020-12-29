package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Bowing", 2015, 40, 80);
        airplane.info();

        airplane.setYear(2018);
        airplane.setLength(45);
        airplane.fillUp(25000);
        airplane.fillUp(15000);
        airplane.info();
    }
}