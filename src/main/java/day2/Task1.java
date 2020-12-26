package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество этажей: ");
        int floor = scanner.nextInt();

        if (floor <= 0) {
            System.err.println("Ошибка ввода");
        } else if (floor >= 1 && floor <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floor >= 5 && floor <= 8) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
        scanner.close();
    }
}