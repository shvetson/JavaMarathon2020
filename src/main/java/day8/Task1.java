package day8;

public class Task1 {
    public static void main(String[] args) {
        String stringConcat = "";
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 20000;
        long start = 0;
        long end = 0;

        // Concat method
        start = System.nanoTime();
        for (int i = 0; i <= counter; i++) {
            stringConcat = stringConcat + i + " ";
        }
        end = System.nanoTime();
        System.out.printf("Time of concat method %d ns\n", end - start);

        // StringBuilder
        start = System.nanoTime();
        for (int i = 0; i <= counter; i++) {
            stringBuilder.append(i).append(" ");
        }
        end = System.nanoTime();
        System.out.printf("Time of StringBuilder %d ns\n", end - start);
    }
}