package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String path = "src/main/java/day14/people.txt";
        File file = new File(path);
        List<Person> objectList = new ArrayList<>();

        try {
            objectList = parseFileToObjectList(file);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }

        for (Person item : objectList) {

            if (item.getAge() < 0) {
                try {
                    throw new DataFileException("Некорректный входной файл.");
                } catch (DataFileException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(item);
        }
    }

    public static List<Person> parseFileToObjectList(File file) throws FileNotFoundException {
        List<Person> personList = new ArrayList<>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String[] lineValues = scanner.nextLine().split(" ");
            personList.add(new Person(lineValues[0], Integer.parseInt(lineValues[1])));
        }
        scanner.close();
        return personList;
    }
}
