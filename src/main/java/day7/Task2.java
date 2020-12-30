package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        final int MAX_STAMINA = 100;
        final int MIN_STAMINA = 90;
        Random random = new Random();

        // Выход 6 игроков на поле
        Player[] players = new Player[Player.maxCountPlayers];
        for (int i = 0; i < Player.maxCountPlayers; i++) {
            int stamina = MIN_STAMINA + random.nextInt(MAX_STAMINA - MIN_STAMINA + 1);
            players[i] = new Player(stamina);
        }

        Player.info();
        System.out.println();

        // Попытка выйти игрока на поле
        Player player = new Player(MIN_STAMINA); // попытка выйти игрока на поле
        System.out.println();

        // Игрок (номер 0) бегает, устает, покидает поле
        int staminaCurrent = players[0].getStamina();
        for (int i = 0; i < staminaCurrent; i++) {
            players[0].run();
        }
    }
}