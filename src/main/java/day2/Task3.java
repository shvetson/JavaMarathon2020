package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа (a < b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.err.println("Некорректный ввод");
        } else {
            while (a < b) {
                ++a;
                if ((a % 5 == 0) && !(a % 10 == 0)) {
                    System.out.print(a + " ");
                }
            }
        }
        scanner.close();
    }
}