package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> listCars = new ArrayList<>();
        listCars.add("VAZ");
        listCars.add("GAZ");
        listCars.add("KamAZ");
        listCars.add("UAZ");
        listCars.add("LiAZ");

        for (String listCar : listCars) {
            System.out.println(listCar);
        }
        System.out.println();

        listCars.add(3, "PAZ");

        for (String listCar : listCars) {
            System.out.println(listCar);
        }
        System.out.println();

        listCars.remove(0);

        for (String listCar : listCars) {
            System.out.println(listCar);
        }
    }
}