package day18;

public class Task2 {
    private static String s = "";
    private static int counter = 0;

    public static void main(String[] args) {
        long n = 717771237L;

        s = Long.toString(n);
        count7(s.length() - 1);
        System.out.println("Count number 7: " + counter);
    }

    private static void count7(int n) {
        if (n >= 0) {
            if (s.charAt(n) == '7') {
                counter++;
            }
            n = n - 1;
            count7(n);
        }
    }
}