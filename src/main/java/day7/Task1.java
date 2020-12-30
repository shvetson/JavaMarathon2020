package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Bowing", 2010, 50, 80);
        Airplane airplane2 = new Airplane("Airbus", 2016, 45, 90);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}