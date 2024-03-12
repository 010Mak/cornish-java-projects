import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        String operation = input.next();
        
        switch (operation) {
            case "+": System.out.println(num1 + num2); break;
            case "-": System.out.println(num1 - num2); break;
            case "*": System.out.println(num1 * num2); break;
            case "/": System.out.println(num2 != 0 ? num1 / num2 : "Error"); break;
            default: System.out.println("Invalid operation");
        }
        
        input.close();
    }
}