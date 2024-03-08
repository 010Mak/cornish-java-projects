import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
      
        System.out.println("enter name");
        String teamName = scanner.nextLine();
        
        System.out.println("how much do you watch");
        String watchFrequency = scanner.nextLine();
        
        System.out.println("i guess you watch " + teamName + " " + watchFrequency);
    }
}
