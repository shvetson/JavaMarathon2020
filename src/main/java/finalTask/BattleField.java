package finalTask;

public class BattleField {
    private Figure[][] field;
    Figure empty = Figure.EMPTY;

    public BattleField(Figure[][] field) {
        this.field = field;
    }

    public Figure[][] getField() {
        return field;
    }

    public void setField(Figure[][] field) {
        this.field = field;
    }

    public void turn(int[] data) {
        if (field[data[0] - 1][data[0] - 1] == Figure.SHIP) {
            field[data[0] - 1][data[0] - 1] = Figure.RED;
            System.out.println("Попадание!");
        } else {
            System.err.println("Мимо!");
        }
    }

    public int countShip() {
        int sum = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == Figure.SHIP) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public void print() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != null) {
                    System.out.print(field[i][j].getEmoji() + " ");
                } else System.out.print(empty.getEmoji() + " ");
            }
            System.out.println();
        }
    }
}
