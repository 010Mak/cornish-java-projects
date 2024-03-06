import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "Do you like vanilla ice cream?",
            "Have you ever traveled to another country?",
            "Do you enjoy hiking?",
            "Is reading a hobby of yours?",
            "Do you have a pet?"
        };

        boolean[] responses = new boolean[5];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            responses[i] = scanner.nextBoolean();
        }

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i] + ": " + responses[i]);
        }

        scanner.close();
    }
}
