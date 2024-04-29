import java.util.Scanner;

public class SimpleBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 100.0; // initial balance
        String password = "1234"; // simple password

        System.out.println("Welcome to SimpleBank!");
        System.out.print("Please enter your password: ");
        String inputPassword = scanner.nextLine();

        if (!inputPassword.equals(password)) {
            System.out.println("Incorrect password. Exiting...");
            return; // end the program
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View balance");
            System.out.println("2. Deposit funds");
            System.out.println("3. Withdraw funds");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your balance: $%.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: $");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.printf("New balance: $%.2f%n", balance);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawal;
                        System.out.printf("New balance: $%.2f%n", balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using SimpleBank. Goodbye!");
                    exit = true; // exit the loop
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

        scanner.close(); // close the scanner to avoid resource leaks
    }
}