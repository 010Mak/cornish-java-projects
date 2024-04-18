import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("numzer: ");
        int n = scanner.nextInt();

        int sum = 0;
        StringBuilder expression = new StringBuilder();

      
        for (int i = 0; i <= n; i++) {
            sum += (n - i); 
            if (i == 0) {
                expression.append(n);
            } else {
                expression.append(" + (").append(n).append("-").append(i).append(")");
            }
        }

        expression.append(sum);
        System.out.println(expression.toString());
    }
}
