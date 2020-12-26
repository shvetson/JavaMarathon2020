package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner cmdLine = new Scanner(System.in);
        System.out.println("Введите два числа");

        for (int i = 0; i < 5; i++) {
            double a = cmdLine.nextDouble();
            double b = cmdLine.nextDouble();

            if (b == 0) {
                System.err.println("Деление на 0");
                continue;
            }

            double c = a / b;
            System.out.printf("%.2f\n", c);
        }
    }
}