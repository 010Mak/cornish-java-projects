import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("score ");
        int score = scanner.nextInt();
        
        String yourgradelol;
        if (score >= 90) yourgradelol = "A";
        else if (score >= 80) yourgradelol = "B";
        else if (score >= 70) yourgradelol = "C";
        else if (score >= 60) yourgradelol = "D";
        else yourgradelol = "F";
        
        System.out.println("grade " + yourgradelol);
    }
}
