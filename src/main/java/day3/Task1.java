package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String city;
        boolean flag = true;

        Scanner cmdLine = new Scanner(System.in);
        System.out.print("Введите название города: ");

        while (flag) {
            city = cmdLine.nextLine();

            switch (city.toLowerCase()) {
                case "москва":
                case "владивосток":
                case "ростов":
                    System.out.println("Страна - Россия");
                    break;
                case "рим":
                case "милан":
                case "турин":
                    System.out.println("Страна - Италия");
                    break;
                case "ливерпуль":
                case "манчестер":
                case "лондон":
                    System.out.println("Страна - Англия");
                    break;
                case "берлин":
                case "мюнхен":
                case "кельн":
                    System.out.println("Страна - Германия");
                    break;
                case "stop":
                    flag = false;
                    break;
                default:
                    System.err.println("Неизвестная страна");
                    break;
            }
        }
    }
}