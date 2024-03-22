public class Main {
    public static void main(String[] args) {
        int s = 150, r = 125;
        
        printdadivisbility(s);
        printdadivisbility(r);
    }

    public static void printdadivisbility(int number) {
        System.out.println("by 2: " + (number % 2 == 0));
        System.out.println("by 3: " + (number % 3 == 0));
        System.out.println("by 5: " + (number % 5 == 0));
        System.out.println("by 10: " + (number % 10 == 0));
        System.out.println("by 20: " + (number % 20 == 0));
    }
}
