package day13;


import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message item : messages) {
            if (item.getSender().equals(u1) && item.getReceiver().equals(u2) ||
                    item.getSender().equals(u2) && item.getReceiver().equals(u1)) {
                System.out.println(item.getSender().getUsername() + " -> " +
                        item.getReceiver().getUsername() + ": " + item.getText());
            }
        }
    }
}