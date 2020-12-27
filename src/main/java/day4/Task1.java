package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner cmdLine = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        boolean flag = true;
        int numberOfEight = 0;
        int numberOfOne = 0;
        int numberEven = 0;
        int numberOdd = 0;
        int sum = 0;

        Random random = new Random();

        while (flag) {
            int count = cmdLine.nextInt();

            if (count <= 0) {
                System.err.println("Ошибка ввода");
                continue;
            }

            int[] numbers = new int[count];

            for (int i = 0; i < count; i++) {
                numbers[i] = random.nextInt(10);
            }

            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");

                if (numbers[i] > 8) {
                    numberOfEight++;
                }

                if (numbers[i] == 1) {
                    numberOfOne++;
                }

                if (numbers[i] % 2 == 0) {
                    numberEven++;
                } else {
                    numberOdd++;
                }
                sum = sum + numbers[i];
            }
            System.out.println();
            System.out.println("Длина массива: " + count);
            System.out.println("Количество чисел больше 8: " + numberOfEight);
            System.out.println("Количество чисел равных 1: " + numberOfOne);
            System.out.println("Количество четных чисел: " + numberEven);
            System.out.println("Количество нечетных чисел: " + numberOdd);
            System.out.println("Сумма всех элементов массива: " + sum);

            flag = false;
        }
    }
}