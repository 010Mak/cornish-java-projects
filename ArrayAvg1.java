import java.util.Scanner;

public class ArrayAvg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[5];

        System.out.println("enter 5:");
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        double average = sum / 5;

        System.out.println(average);
        
        scanner.close();
    }
}
