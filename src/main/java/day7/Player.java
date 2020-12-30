package day7;

public class Player {
    public static int countPlayers;
    public final static int maxCountPlayers = 6;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < maxCountPlayers) {
            ++countPlayers;
            System.out.printf("Игрок вышел на поле (выносливость - %d).\n", stamina);
        } else {
            info();
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > 0) {
            stamina--;
            if (stamina == 0) {
                countPlayers--;
                System.out.println("Игрок покинул поле.");
                info();
            }
        }
    }

    public static void info() {
        int gap = maxCountPlayers - countPlayers;
        String string = "";
        if (gap > 0) {
            switch (gap) {
                case 1:
                    string = "свободное место";
                    break;
                case 2:
                case 3:
                case 4:
                    string = "свободных места";
                    break;
                case 5:
                    string = "свободных мест";
                    break;
            }
            System.out.printf("Команды неполные. На поле еще есть %d %s.\n", gap, string);
        } else {
            System.out.println("На поле нет свободных мест.");
        }
    }
}