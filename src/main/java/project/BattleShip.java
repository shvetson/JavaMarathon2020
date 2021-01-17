package project;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BattleShip {
    static final int COUNT_CELL = 10;
    static Figure[][] field1;
    static Figure[][] field2;
    static int countSingle;
    static int countDouble;
    static int countThree;
    static int countFour;
    static Scanner scanner;
    static Random random;

    public static void main(String[] args) {
        field1 = new Figure[COUNT_CELL][COUNT_CELL];
        field2 = new Figure[COUNT_CELL][COUNT_CELL];
        scanner = new Scanner(System.in);
        random = new Random();

        System.out.println("Начнем расставлять корабли на поле - Игрок 1. Другой игрок, не смотри!");
        inputData(field1);
        BattleField battleField1 = new BattleField(field1);
        System.out.println();

        System.out.println("Начнем расставлять корабли на поле - Игрок 2. Первый игрок, не смотри!");
        inputData(field2);
        BattleField battleField2 = new BattleField(field2);
        System.out.println();

        System.out.println("Игра начинается!");

        game(battleField1, battleField2);
        System.out.println();

        System.out.println("Игра окончена!");
        scanner.close();
    }

    // игра - ходы игроков и проверки попаданий, завершение игры
    public static void game(BattleField field1, BattleField field2) {
        boolean turnPlayer = random.nextBoolean();
        for (; ; ) {
            if (turnPlayer) {
                if (turn(1, field1, 2, field2)) {
                    turnPlayer = true;
                } else {
                    turnPlayer = false;
                }
                if (field2.countShip() == 0) {
                    System.out.println("Вы победили!");
                    field2.print();
                    break;
                }
            } else {
                if (turn(2, field2, 1, field1)) {
                    turnPlayer = false;
                } else {
                    turnPlayer = true;
                }
                if (field1.countShip() == 0) {
                    System.out.println("Вы победили!");
                    field1.print();
                    break;
                }
            }
        }
    }

    // ход игрока
    public static boolean turn(int playerAttack, BattleField fieldAttack, int playerDefence, BattleField fieldDefence) {
        Pattern pattern = Pattern.compile("^([1-9]|10),([1-9]|10)$");
        Matcher matcher = null;
        String line;
        int[] cells = new int[2];
        int counter = 0;

        for (; ; ) {
            System.out.print("Игрок " + playerAttack);
            System.out.println(", Ваш ход (x1, y1): ");
            line = scanner.nextLine();

            if (line.equals("info")) {
                System.out.println("Игрок " + playerAttack + ": " + fieldAttack.countShip() +
                        " vs Игрок " + playerDefence + ": " + fieldDefence.countShip());
                continue;
            }
            if (line.equals("print")) {
                fieldAttack.print();
                continue;
            }
            matcher = pattern.matcher(line);
            if (!matcher.matches()) {
                System.err.println("Ошибка ввода, соблюдайте формат");
            } else {
                break;
            }
        }

        String[] check = line.split(",");
        for (String value : check) {
            int number = Integer.parseInt(value);
            cells[counter] = number;
            counter++;
        }
        return fieldDefence.checkTurn(cells);
    }

    // Расстановка кораблей на поле
    public static void inputData(Figure[][] field) {
        countSingle = 4;
        countDouble = 3;
        countThree = 2;
        countFour = 1;

        Pattern pattern = Pattern.compile("^([1-9]|10),([1-9]|10);([1-9]|10),([1-9]|10)$");
        Matcher matcher;

        int[] cellsForShip;
        int[] cellsForHalo;

        for (; ; ) {
            System.out.printf("Введите координаты корабля, цифры от 1 до %s (формат: x1, y1; x2, y2)\n", COUNT_CELL);
            String line = scanner.nextLine();

            if (line.equals("limit")) {
                limit();
                continue;
            }

            matcher = pattern.matcher(line);
            if (!matcher.matches()) {
                System.err.println("Ошибка ввода, соблюдайте формат - x1, y1; x2, y2)");
                continue;
            }
            cellsForShip = createCellsFromLine(line);
            cellsForHalo = createCellsFromLine(line);

            if (!checkInput(cellsForShip)) {
                continue;
            }
            if (!checkLimitShip(cellsForShip)) {
                System.err.println("Лимит кораблей выбран");
                continue;
            }
            updateCellsForHole(cellsForHalo);
            if (!checkCellsHalo(cellsForHalo, field)) {
                continue;
            }
            addShip(cellsForShip, field);

            if (countSingle + countDouble + countThree + countFour == 0) {
                System.out.println("Все корабли расставлены на поле");
                return;
            }
        }
    }

    // проверка оставшегося количества кораблей определенной размерности
    public static boolean checkLimitShip(int[] data) {
        int value = countDesk(data);
        if ((value == 1) && (countSingle == 0)) {
            return false;
        } else if ((value == 2) && (countDouble == 0)) {
            return false;
        } else if ((value == 3) && (countThree == 0)) {
            return false;
        } else if ((value == 4) && (countFour == 0)) {
            return false;
        }
        return true;
    }

    // счетчик кораблей на поле
    public static void countShip(int value) {
        switch (value) {
            case 1:
                countSingle--;
                break;
            case 2:
                countDouble--;
                break;
            case 3:
                countThree--;
                break;
            case 4:
                countFour--;
                break;
        }
    }

    // определение размерности корабля
    public static int countDesk(int[] data) {
        return Math.max(data[2] - data[0], data[3] - data[1]) + 1;
    }

    // размещение корабля на поле
    public static void addShip(int[] data, Figure[][] field) {
        for (int row = data[0] - 1; row <= data[2] - 1; row++) {
            for (int col = data[1] - 1; col <= data[3] - 1; col++) {
                field[row][col] = Figure.SHIP;
            }
        }
        System.out.println("Корабль размещен на поле");
        countShip(countDesk(data));
    }

    // проверка корректности ввода координат
    public static boolean checkInput(int[] data) {
        if ((data[0] > data[2]) || (data[1] > data[3])) {
            System.err.println("Проверьте значения 1-ой точки координат корабля");
            return false;
        }
        if ((data[0] != data[2]) && (data[1] != data[3])) {
            System.err.println("Проверьте расположение корабля (по вертикали или горизонтали)");
            return false;
        }
        if (countDesk(data) > 4) {
            System.err.println("Проверьте размерность корабля");
            return false;
        }
        return true;
    }

    // формирование массива чисел с координатами корабля
    public static int[] createCellsFromLine(String line) {
        int[] data = new int[4];
        int counter = 0;

        String[] check1 = line.split(";");
        for (String item : check1) {
            String[] check2 = item.split(",");
            for (String value : check2) {
                int number = Integer.parseInt(value);
                data[counter] = number;
                counter++;
            }
        }
        return data;
    }

    // корректировка координат ореола для правильного отражения на поле
    public static void updateCellsForHole(int[] data) {
        if (data[0] - 2 < 0) {
            data[0] = 2;
        }
        if (data[1] - 2 < 0) {
            data[1] = 2;
        }
        if (data[2] == COUNT_CELL) {
            data[2] = COUNT_CELL - 1;
        }
        if (data[3] == COUNT_CELL) {
            data[3] = COUNT_CELL - 1;
        }
    }

    // проверка на примыкание корабля к кораблям на поле и отрисовка ореола
    public static boolean checkCellsHalo(int[] data, Figure[][] field) {
        for (int row = data[0] - 2; row <= data[2]; row++) {
            for (int col = data[1] - 2; col <= data[3]; col++) {
                if ((field[row][col] == null) || (field[row][col].getValue() == -1)) {
                    field[row][col] = Figure.BLUE;
                } else {
                    System.err.println("Некорректные данные корабля, примыкает к другому");
                    return false;
                }
            }
        }
        return true;
    }

    // инфо об оставшемся лимите кораблей
    public static void limit() {
        System.out.printf("Осталось кораблей:\nОднопалубный - %s\nДвухпалубный - %s\nТрехпалубный - %s\nЧетырехпалубный - %s\n",
                countSingle, countDouble, countThree, countFour);
    }
}