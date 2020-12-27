package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int count = 100;
        int maxValue = 10000;
        int countNext = 3;

        int lineTriplet = count - (countNext - 1);
        int colTriplet = countNext;

        Random random = new Random();
        int[] numbers = new int[count];
        int[][] triplet = new int[lineTriplet][colTriplet];

        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(maxValue);
        }

        for (int i = 0; i < lineTriplet; i++) {
            for (int j = 0; j < colTriplet; j++) {
                triplet[i][j] = numbers[i + j];
            }
        }

        int indexLine = 0;
        int maxSumLine = 0;

        for (int i = 0; i < lineTriplet; i++) {
            int sumLine = 0;
            for (int j = 0; j < colTriplet; j++) {
                sumLine += triplet[i][j];
            }
            if (sumLine > maxSumLine) {
                maxSumLine = sumLine;
                indexLine = i;
            }
        }
        System.out.println("Максимальная сумма тройки: " + maxSumLine);
        System.out.println("Индекс 1го элемента в тройке: " + indexLine);
    }
}