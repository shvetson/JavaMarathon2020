package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static final int COUNT_DIGITS = 1000;
    public static final int RANGE = 20;

    public static void main(String[] args) {
        String path1 = "src/main/java/day16/file1.txt";
        String path2 = "src/main/java/day16/file2.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);

        try {
            createFileInteger(file1);
            createFileDouble(file1, file2);
            printResult(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void createFileInteger(File file) throws FileNotFoundException {
        Random random = new Random();
        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < COUNT_DIGITS; i++) {
            printWriter.println(random.nextInt(100));
        }
        printWriter.close();
    }

    public static void createFileDouble(File file1, File file2) throws FileNotFoundException {
        Scanner scanner = new Scanner(file1);
        PrintWriter printWriter = new PrintWriter(file2);
        int sum = 0;

        while (scanner.hasNext()) {
            for (int i = 1; i <= RANGE; i++) {
                String lineNumber = scanner.nextLine();
                sum += Integer.parseInt(lineNumber);
                if (i == RANGE) {
                    printWriter.println((double) sum / RANGE);
                    sum = 0;
                }
            }
        }
        printWriter.close();
        scanner.close();
    }

    public static void printResult(File file) throws FileNotFoundException {
        double sum = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String lineNumber = scanner.nextLine();
            sum += Double.parseDouble(lineNumber);
        }
        System.out.printf("%d", (int) sum);
        scanner.close();
    }
}
