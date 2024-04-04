import java.util.Scanner;

public class Phcalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neutral = 0, acid = 0, base = 0;

        System.out.println("enter ples");

        while (true) {
            double pH = scanner.nextDouble();

            if (pH == -1) {
                break;
            }

            if (pH < 7.0) {
                acid++;
            } else if (pH > 7.0) {
                base++;
            } else {
                neutral++;
            }
        }

        System.out.println("acid " + acid);
        System.out.println("base " + base);
        System.out.println("neut " + neutral);
    }
}
