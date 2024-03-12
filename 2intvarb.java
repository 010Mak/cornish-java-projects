import java.util.Scanner;

public class 2intvarb {
    public static void main(String[] args) throws Exception {

    Scanner kb = new Scanner (System.in);

    int a = kb.nextInt();
    int b = kb.nextInt();

    System.out.println(a>=b);

    kb.close();

    }
}
