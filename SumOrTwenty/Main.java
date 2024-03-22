import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("x ");
        int x = scanner.nextInt();
       
        System.out.print("y ");
        int y = scanner.nextInt();
        
        int sum = x + y;
        
        if (sum >= 10 && sum <= 19) {
            System.out.println("20");
        } else {
            System.out.println(sum);
        }
    }
}
