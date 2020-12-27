package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int count = 100;
        int valueMax = 1000;
        int countFinishZero = 0;
        int sumFinishZero = 0;

        int[] numbers = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(valueMax);
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            if (String.valueOf(number).lastIndexOf("0") == String.valueOf(number).length() - 1) {
                countFinishZero++;
                sumFinishZero += number;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающих на 0: " + countFinishZero);
        System.out.println("Сумма элементов массива, оканчивающих на 0: " + sumFinishZero);
    }
}