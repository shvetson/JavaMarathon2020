package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        List<Record> listShoes = new ArrayList<>();
        String path1 = "src/main/resources/shoes.csv";
        String path2 = "src/main/java/day15/missing_shoes.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);
        PrintWriter printWriter = null;

        try {
            listShoes = parseDataFromFileToList(file1);
            printWriter = new PrintWriter(file2);

            for (Record item : listShoes) {
                if (item.getCount() == 0) {
                    printWriter.println(item.getName() + ", " + item.getSize() + ", " + item.getCount());
                }
            }
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }
    }

    public static List<Record> parseDataFromFileToList(File file) throws FileNotFoundException {
        List<Record> listShoes = new ArrayList<>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] itemsLine = line.split(";");
            listShoes.add(new Record(itemsLine[0], Integer.parseInt(itemsLine[1]), Integer.parseInt(itemsLine[2])));
        }
        scanner.close();
        return listShoes;
    }
}