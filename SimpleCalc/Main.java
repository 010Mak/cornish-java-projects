/*
* Main.java
* HS Intro Java 
* General calculator for any purpose
* @author: Mak
* March 12
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        String operation = scanner.next();

        switch (operation) {
            case "+": System.out.println(num1 + num2); break;
            case "-": System.out.println(num1 - num2); break;
            case "*": System.out.println(num1 * num2); break;
            case "/": System.out.println(num2 != 0 ? num1 / num2 : "silly error encountered"); break;
            default: System.out.println("you cant do that");
        }

        scanner.close();
    }
}
