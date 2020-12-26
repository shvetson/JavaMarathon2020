package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double x = scanner.nextDouble();
        double y;

        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x < 5 && x > -3) {
            y = (x + 3) / (Math.pow(x, 2) - 2);
        } else {
            y = 420;
        }
        scanner.close();
        System.out.printf("%.2f\n", y);
    }
}