import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter pls: ");
        int n = scanner.nextInt(); 
        scanner.close();

        int sum = 0;

        for (int i = 2; i <= n; i += 2) { 
            sum += i; 
        }

        System.out.println("sum from 1 to your silly number " + n + " is: " + sum);
    }
}
