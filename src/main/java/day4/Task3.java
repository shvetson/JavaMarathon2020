package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int maxValue = 50;
        int countLine = 12;
        int countCol = 8;
        int indexLine = 0;

        Random random = new Random();
        int[][] numbers = new int[countLine][countCol];
        int[] sumsLine = new int[countLine];

        for (int i = 0; i < countLine; i++) {
            for (int j = 0; j < countCol; j++) {
                numbers[i][j] = random.nextInt(maxValue);
            }
        }

        for (int i = 0; i < countLine; i++) {
            int sumLine = 0;
            for (int j = 0; j < countCol; j++) {
                sumLine += numbers[i][j];
            }
            System.out.println(i + ". " + sumLine);
            sumsLine[i] = sumLine;
        }

        int max = sumsLine[0];
        for (int i = 0; i < countLine; i++) {
            if (sumsLine[i] > max) {
                max = sumsLine[i];
                indexLine = i;
            }
        }
        System.out.println("Индекс строки: " + indexLine) ;
    }
}