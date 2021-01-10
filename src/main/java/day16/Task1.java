package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String path = "src/main/java/day16/digits.txt";
        File file = new File(path);

        try {
            printResult(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        int sum = 0;
        for (String item : numbersString) {
            sum += Integer.parseInt(item);
        }

        double average = 0.0;
        average = (float) sum / numbersString.length;

        System.out.println(average);
        System.out.printf("%.3f\n", average);

        scanner.close();
    }
}