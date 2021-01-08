package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String path = "src/main/java/day14/people.txt";
        File file = new File(path);
        List<String> listString = new ArrayList<>();

        try {
            listString = parseFileToStringList(file);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }

        for (String item : listString) {
            String[] lineValues = item.split(" ");

            if (Integer.parseInt(lineValues[1]) < 0) {
                try {
                    throw new DataFileException("Некорректный входной файл.");
                } catch (DataFileException e) {
                    e.printStackTrace();
                } finally {
                    item = "***";
                }
            }

            System.out.println(item);
        }
    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        List<String> listPeople = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            listPeople.add(scanner.nextLine());
        }
        scanner.close();
        return listPeople;
    }
}
