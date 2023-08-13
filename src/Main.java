import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        generateRandomArray();
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        int[] billAccounts = new int[30];
        Random random = new Random();

        for (int i = 0; i < billAccounts.length; i++) {
            billAccounts[i] = random.nextInt(100_001) + 100_000;
        }
        return billAccounts;
    }

    private static void task1() {
        System.out.println("Task 1");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int payment:arr) {
            sum += payment;
        }
        System.out.printf("The amount of expenses for the month was %d rubles.%n%n", sum);
    }
    private static void task2() {
        System.out.println("Task 2");
        int[ ] arr = generateRandomArray();
        int max = 0;
        Arrays.sort(arr);
        System.out.printf("min: %d, max: %d%n", arr[0], arr[arr.length-1]);

        for (int j : arr) {
            if (j >= max) max = j;
        }
        //System.out.println("Max: " + max);
        int min = max;

        for (int j : arr) {
            if (j <= min) min = j;
        }
        //System.out.println("Min: " + min);
        System.out.printf("The minimum amount spent per day was %d rubles. The maximum amount spent per day was %d rubles%n%n", min, max);
    }
    private static void task3() {
        System.out.println("Task 3");
        int[ ] arr = generateRandomArray();
        int sum = 0;

        for (int payment:arr) {
            sum += payment;
        }
        double arithmeticMean = (double) sum / arr.length;
        System.out.printf("The average amount spent for the month was %.2f rubles%n%n", arithmeticMean);
    }
     private static void task4() {
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


}