import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many immediate family members do you have?");
        int numberOfFamilyMembers = scanner.nextInt();
        scanner.nextLine(); 

        StringBuilder combinedInitials = new StringBuilder();

        System.out.println("Enter the first initial of each family member's name:");
        for (int i = 0; i < numberOfFamilyMembers; i++) {
            System.out.print("Initial " + (i + 1) + ": ");
            String initial = scanner.nextLine();

            if (!initial.isEmpty()) {
                combinedInitials.append(initial.charAt(0));
            }
        }

        System.out.println("Combined initials: " + combinedInitials.toString());

        scanner.close();
    }
}
