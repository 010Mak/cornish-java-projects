import java.util.Scanner;

public class FactorGen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ze nombre");
        int number = scanner.nextInt();

        generateFactors(number);
    }

    public static void generateFactors(int number) {
        System.out.println("ze facteror " + number + " ze");

        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
