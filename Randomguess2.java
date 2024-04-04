

import java.util.Scanner;

public class Randomguess2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;

        System.out.println("guess ze number");

        while (guess != randomNumber) {
            System.out.print("your guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {

                System.out.println("higher");
            } else if (guess > randomNumber) {

                System.out.println("lower");
            } else {

                System.out.println("corret");
            }
        }
    }
}
