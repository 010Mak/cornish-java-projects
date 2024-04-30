import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0; 
        String password = "1234"; 

        System.out.println("silly ahh bank; screw you and your financial problems!");
        System.out.print("enter your goofy password: ");
        String inputPassword = scanner.nextLine();

        if (!inputPassword.equals(password)) {
            System.out.println("moron.");
            return; 
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("\nchoose before i lock you out");
            System.out.println("1. View balance");
            System.out.println("2. Deposit funds");
            System.out.println("3. Withdraw funds");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("balance: $%.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: $");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.printf("balance: $%.2f%n", balance);
                    break;

                case 3:
                    System.out.print("withdrawal amount: $");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > balance) {
                        System.out.println("insufficient funds.");
                    } else {
                        balance -= withdrawal;
                        System.out.printf("balance: $%.2f%n", balance);
                    }
                    break;

                case 4:
                    System.out.println("thanks for using silly ahh bank");
                    exit = true; 
                    break;

                default:
                    System.out.println("invalid.");
                    break;
            }
        }

        scanner.close(); 
    }
}
