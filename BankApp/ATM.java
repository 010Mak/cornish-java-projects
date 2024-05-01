import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0; 
        String password = "1234"; 

        System.out.println("silly ahh bank; screw you and your financial problems!");
        System.out.print("enter your goofy password: ");
        String inputofyourgoofyahhpassword = scanner.nextLine();

        if (!inputofyourgoofyahhpassword.equals(password)) {
            System.out.println("moron.");
            return; 
        }

        boolean exit = false;

while (!exit) {
          
    System.out.println("choose before i lock you out");
    System.out.println("1. exit");
    System.out.println("2. withdraw");
    System.out.println("3. deposit");
    System.out.println("4. balance");

    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            
            System.out.println("thanks for using silly ahh bank");
            exit = true; 
            break;

        case 2:
           
            System.out.print("withdrawal amount: $");
           
            double withdraw = scanner.nextDouble();
            
            if (withdraw > balance) {
                System.out.println("your broke");
            } else {
                balance -= withdraw;
                System.out.printf("balance: $%.2f%n", balance);
            }
            break;

        
        case 3:
            System.out.print("deposit amount: $");
            
            double deposit = scanner.nextDouble();
            balance += deposit;
            System.out.printf("balance: $%.2f%n", balance);
            break;

        case 4:
           
            System.out.printf("balance: $%.2f%n", balance);
            break;

        
        default:
            break;
    }
}

scanner.close(); 
}
}
