import java.util.Scanner;
import java.util.Random;

public class NameGuess {
    public static void main(String[] args) {
        String[] names = {"Iris", "Brian", "Mak", "Seb", "Sean", "Will", "Rishaan"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String chosenName = names[random.nextInt(names.length)];
        char[] maskedName = new char[chosenName.length()];
        for (int i = 0; i < maskedName.length; i++) {
            maskedName[i] = '*';
        }

        System.out.println("guess name: " + new String(maskedName));

        while (new String(maskedName).contains("*")) {
            System.out.print("enter a letter: ");
            char guessedLetter = scanner.nextLine().charAt(0);

            boolean found = false;
            for (int i = 0; i < chosenName.length(); i++) {
                if (chosenName.charAt(i) == guessedLetter) {
                    maskedName[i] = guessedLetter;
                    found = true;
                }
            }

            if (!found) {
                System.out.println("letter not in the name.");
            }

            System.out.println(maskedName);
        }

        System.out.println("correct: the name was: " + chosenName);
        scanner.close();
    }
}
