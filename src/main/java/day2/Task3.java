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
            a = a + 1;
            while (a < b) {
                if ((a % 5 == 0) && !(a % 10 == 0)) {
                    System.out.print(a + " ");
                }
                a++;
            }
        }
        scanner.close();
    }
}