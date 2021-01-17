package finalTask;

public enum Figure {
    SHIP (1, "\uD83D\uDEE5"),
    EMPTY(-1, "⬜"),
    BLUE(-1, "\uD83D\uDFE6"),
    RED(-1, "\uD83D\uDFE5");

    private int value;
    private String emoji;

    Figure(int value, String emoji){
        this.value = value;
        this.emoji = emoji;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }
}
