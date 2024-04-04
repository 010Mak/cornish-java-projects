import java.util.Scanner;

public class ProdSqrtN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double product = 1.0;

        System.out.println("gimme n pls");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            product *= Math.sqrt(i);
        }

        System.out.println("prozeducts of 1 to " + n + " is: " + product);
    }
}
