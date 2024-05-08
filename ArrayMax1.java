import java.util.Scanner;

public class ArrayMax1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Finding the maximum value
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("largest value is: " + max);
        
        scanner.close();
    }
}
