import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        double sum = 0;
        int totalNumbers = 0;

        while (true) {
            System.out.println("0 to quit");
            int number = scanner.nextInt();

            if (number == 0) break;

            if (number > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            sum += number;
            totalNumbers++;
        }

        if (totalNumbers > 0) {
            double average = sum / totalNumbers;
            System.out.println("positive: " + positiveCount);
            System.out.println("negative: " + negativeCount);
            System.out.println("sum: " + sum);
            System.out.printf("av. " + average);
        } else {
            System.out.println("silly error");
        }
    }
}
