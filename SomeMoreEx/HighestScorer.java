import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String highestScorerName = "";
        int highestScore = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("name: ");
            String studentName = scanner.nextLine();

            System.out.print(studentName + " score");
            int score = scanner.nextInt();
            scanner.nextLine(); 
            if (score > highestScore) {
                highestScore = score;
                highestScorerName = studentName;
            }
        }

        System.out.println("high score" + highestScorerName + " with score of " + highestScore);
    }
}
