import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("first name: ");
        String userFirstName = scanner.nextLine();

        System.out.print("last name: ");
        String userLastName = scanner.nextLine();

        System.out.print("parent name: ");
        String parentFirstName = scanner.nextLine();

        System.out.print("parent last name: ");
        String parentLastName = scanner.nextLine();

        boolean isFirstNamesSame = userFirstName.equalsIgnoreCase(parentFirstName);
        boolean isLastNamesSame = userLastName.equalsIgnoreCase(parentLastName);

       
        System.out.println("Do the first names match? " + isFirstNamesSame);
        System.out.println("Do the last names match? " + isLastNamesSame);

        scanner.close();
    }
}
