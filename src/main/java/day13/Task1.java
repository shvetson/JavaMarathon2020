package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Иванов");
        User user2 = new User("Петров");
        User user3 = new User("Сидоров");

        user1.subscribe(user2);
        user1.subscribe(user3);

        System.out.println(user1.getSubscriptions());
        System.out.println(user1.isSubscribed(user2));
        System.out.println();

        user1.sendMessage(user2, "Привет!");
        user2.sendMessage(user1, "Добрый день!");
        user1.sendMessage(user2, "Как у тебя дела?");
        user2.sendMessage(user1, "Все ок, спасибо :)");
        user2.sendMessage(user1, "Предалагаю встретиться, приглашаю на завтрак.");

        user3.sendMessage(user1, "С наступающими новогодними праздниками!");
        user1.sendMessage(user3, "Спасибо, взаимно!");
        user3.sendMessage(user1, "Какие планы, где празднуете?");
        user1.sendMessage(user3, "Дома, с семьей!");
        user3.sendMessage(user1, "А вы?");
        user1.sendMessage(user3, "За городом, с баней, приезжайте!");
        user3.sendMessage(user1, "Спасибо, с удовольствием!");

        MessageDatabase.showDialog(user1, user2);
        System.out.println();
        MessageDatabase.showDialog(user3, user1);

        System.out.println();
        System.out.println(user1.isFriend(user2));
        System.out.println(user2.isFriend(user3));
    }
}