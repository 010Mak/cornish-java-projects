import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Homework18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = scanner.nextLine();
        System.out.println("Password is valid: " + pswdChck(password));
        
        System.out.print("Input a number: ");
        int n = scanner.nextInt();
        binaryMatrix(n);
        
        System.out.print("Input Side-1: ");
        int side1 = scanner.nextInt();
        System.out.print("Input Side-2: ");
        int side2 = scanner.nextInt();
        System.out.print("Input Side-3: ");
        int side3 = scanner.nextInt();
        System.out.println("The area of the triangle is " + triArea(side1, side2, side3));
        
        System.out.print("Input the side length: ");
        int sideLength = scanner.nextInt();
        System.out.println("The area of the pentagon is " + pentArea(sideLength));
        
        dateTime();
        
        twinPrimes();
        
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        System.out.println("Number of 2s: " + twosCount(number));
        
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();
        System.out.println("Check whether the three said numbers are consecutive or not: " + threeConsec(num1, num2, num3));
        
        System.out.print("Input the first number: ");
        int midNum1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int midNum2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int midNum3 = scanner.nextInt();
        System.out.println("Check whether the three said numbers have a midpoint: " + correctMid(midNum1, midNum2, midNum3));
        
        System.out.print("Input an integer(positive/negative): ");
        int digitNum = scanner.nextInt();
        System.out.println("Extract the first digit from the said integer: " + firstDigit(digitNum));
        
        System.out.print("Input an integer(positive/negative): ");
        int factNum = scanner.nextInt();
        factsOf3(factNum);
        
        System.out.print("Input an integer: ");
        int evenNum = scanner.nextInt();
        System.out.println("Check whether every digit of the said integer is even or not: " + allEven(evenNum));
        
        System.out.print("Input a string: ");
        String vowelsStr = scanner.next();
        System.out.println("Check all the characters of the said string are vowels or not: " + allVowels(vowelsStr));
    }

    public static boolean pswdChck(String password) {
        if (password.length() < 10) return false;
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) return false;
            if (Character.isDigit(ch)) digitCount++;
        }
        return digitCount >= 2;
    }

    public static void binaryMatrix(int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rand.nextInt(2) + " ");
            }
            System.out.println();
        }
    }

    public static double triArea(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double pentArea(int side) {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }

    public static void dateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy HH:mm:ss");
        System.out.println("Current date and time: " + now.format(formatter));
    }

    public static void twinPrimes() {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int twosCount(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == 2) count++;
            num /= 10;
        }
        return count;
    }

    public static boolean threeConsec(int a, int b, int c) {
        int[] arr = {a, b, c};
        java.util.Arrays.sort(arr);
        return arr[1] - arr[0] == 1 && arr[2] - arr[1] == 1;
    }

    public static boolean correctMid(int a, int b, int c) {
        return (a + b == 2 * c) || (b + c == 2 * a) || (a + c == 2 * b);
    }

    public static int firstDigit(int num) {
        num = Math.abs(num);
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }

    public static void factsOf3(int num) {
        System.out.print("Factors of 3 of the said integer:\n" + num + " = ");
        boolean first = true;
        while (num % 3 == 0) {
            if (!first) System.out.print(" * ");
            System.out.print(3);
            num /= 3;
            first = false;
        }
        if (!first) System.out.print(" * ");
        System.out.println(num);
    }

    public static boolean allEven(int num) {
        while (num > 0) {
            if ((num % 10) % 2 != 0) return false;
            num /= 10;
        }
        return true;
    }

    public static boolean allVowels(String str) {
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) == -1) return false;
        }
        return true;
    }
}
