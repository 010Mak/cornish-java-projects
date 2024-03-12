import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myName = "X"; //Change this to your name
        System.out.println("Enter the last names of others one by one (type 'stop' to end):");

        while (true) {
            System.out.print("Enter a last name: ");
            String othersName = scanner.nextLine();

            if ("stop".equalsIgnoreCase(othersName)) {
                break;
            }

 
            int comparisonResult = myName.compareTo(othersName);


            if (comparisonResult < 0) {
                System.out.println(othersName + " comes after " + myName);
            } else if (comparisonResult > 0) {
                System.out.println(othersName + " comes before " + myName);
            } else {
                System.out.println(othersName + " is equal to " + myName);
            }
        }

        scanner.close();
    }
}
