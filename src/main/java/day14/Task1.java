package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    static final int COUNT_DIGITS = 10;

    public static void main(String[] args) {
        String path = "src/main/java/day14/digits.txt";
        File file = new File(path);

        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        } catch (DataFileException e) {
            e.printStackTrace();
        }
    }

    public static void printSumDigits(File file) throws DataFileException, FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        if (!(numbersString.length == COUNT_DIGITS)) {
            throw new DataFileException("Некорректный входной файл.");
        } else {
            int sum = 0;
            for (String item : numbersString) {
                sum += Integer.parseInt(item);
            }
            System.out.println("Сумма чисел в файле: " + sum);
        }
        scanner.close();
    }
}
