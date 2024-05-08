import java.util.Scanner;

public class ArrayMonths1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        System.out.println("month: ");
        String inputMonth = scanner.nextLine();
        System.out.println("numzer: ");
        int number = scanner.nextInt();

        int currentMonthIndex = -1;
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(inputMonth)) {
                currentMonthIndex = i;
                break;
            }
        }

        if (currentMonthIndex != -1) {
            int resultIndex = (currentMonthIndex + number) % 12;
            System.out.println(number + " months from " + inputMonth + months[resultIndex]);
        } else {
            System.out.println("nuh uh);
        }

        scanner.close();
    }
}
