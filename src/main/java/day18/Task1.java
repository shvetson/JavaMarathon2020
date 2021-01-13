package day18;

public class Task1 {
    private static int[] numbers;
    private static int sum = 0;

    public static void main(String[] args) {
        numbers = new int[]{1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        recursionSum(numbers.length - 1);
        System.out.println("Sum: " + sum);
    }

    private static void recursionSum(int n) {
        if (n >= 0) {
            sum += numbers[n];
            n = n - 1;
            recursionSum(n);
        }
    }
}