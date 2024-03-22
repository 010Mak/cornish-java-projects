//idk how to do this without using a loop

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i * i * i; 
        }

        System.out.println("sum of cubes 1 " + n + " is: " + sum);
    }
}
