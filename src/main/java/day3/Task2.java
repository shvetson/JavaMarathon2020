package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        boolean flag = true;

        Scanner cmdLine = new Scanner(System.in);
        System.out.println("Введите два числа");

        while (flag) {
            double a = cmdLine.nextDouble();
            double b = cmdLine.nextDouble();

            if (b == 0) {
                flag = false;
            } else {
                double c = a / b;
                System.out.printf("%.2f\n", c);
            }
        }
    }
}
