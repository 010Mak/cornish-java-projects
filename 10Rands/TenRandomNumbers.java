/*
* TenRandomNumbers.java
* BXV HS Intro Java 
* Generate 10 random numbers in specified range by user
* @author: Mak
* March 12
*/

import java.util.Scanner;

public class TenRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minimum number (num1): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter maximum number (num2): ");
        int num2 = scanner.nextInt();

        System.out.println(" 1: " + ((int)(Math.random() * (num2 - num1 + 1) + num1)));
        System.out.println(" 2: " + ((int)(Math.random() * (num2 - num1 + 1) + num1)));
        System.out.println(" 3: " + ((int)(Math.random() * (num2 - num1 + 1) + num1)));
        System.out.println(" 4: " + ((int)(Math.random() * (num2 - num1 + 1) + num1)));
        System.out.println(" 5: " + ((int)(Math.random() * (num2 - num1 + 1) + num1)));
        System.out.println(" 6: " + ((int)(Math.random() * (num2 - num1 + 1) + num1)));
        System.out.println(" 7: " + ((int)(Math.random() * (num2 - num1 + 1) + num1)));
        System.out.println(" 8: " + ((int)(Math.random() * (num2 - num1 + 1) + num1)));
        System.out.println(" 9: " + ((int)(Math.random() * (num2 - num1 + 1) + num1)));
        System.out.println(" 10: " + ((int)(Math.random() * (num2 - num1 + 1) + num1)));

        scanner.close();
    }
}
