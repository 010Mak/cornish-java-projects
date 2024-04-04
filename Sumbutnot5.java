import java.util.Scanner;

public class Sumbutnot5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;

        System.out.println("enter ze number");

        while ((input = scanner.nextInt()) != 5) {
            sum += input;
        }

        System.out.println("za som eez " + sum);
    }
}
