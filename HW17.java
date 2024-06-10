import java.util.Scanner;

public class Homework17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();
        System.out.println("The smallest value is " + minOfThree(num1, num2, num3));
        
        System.out.print("Input the first number: ");
        int num4 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num5 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num6 = scanner.nextInt();
        System.out.println("The average value is " + avgThree(num4, num5, num6));
        
        System.out.print("Input a string: ");
        String str1 = scanner.next();
        System.out.println("The middle character in the string: " + midChar(str1));
        
        System.out.print("Input the string: ");
        String str2 = scanner.next();
        System.out.println("Number of Vowels in the string: " + vowelCount(str2));
        
        System.out.print("Input the string: ");
        scanner.nextLine();  // Consume newline left-over
        String sentence = scanner.nextLine();
        System.out.println("Number of words in the string: " + wordCount(sentence));
        
        System.out.print("Input an integer: ");
        int num7 = scanner.nextInt();
        System.out.println("The sum is " + intSum(num7));
        
        pentagNums();
        
        System.out.print("Input the investment amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Input the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Input number of years: ");
        int years = scanner.nextInt();
        calcInterest(amount, rate, years);
        
        System.out.print("Input first character: ");
        char char1 = scanner.next().charAt(0);
        System.out.print("Input second character: ");
        char char2 = scanner.next().charAt(0);
        charPrint(char1, char2);
        
        System.out.print("Input a year: ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static int minOfThree(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static double avgThree(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static String midChar(String str) {
        int len = str.length();
        int middle = len / 2;
        return len % 2 == 0 ? str.substring(middle - 1, middle + 1) : str.substring(middle, middle + 1);
    }

    public static int vowelCount(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static int wordCount(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public static int intSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void pentagNums() {
        for (int i = 1; i <= 50; i++) {
            int pentagonalNumber = i * (3 * i - 1) / 2;
            System.out.print(pentagonalNumber + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void calcInterest(double amount, double rate, int years) {
        double monthlyRate = rate / 1200;
        System.out.println("Years    FutureValue");
        for (int year = 1; year <= years; year++) {
            double futureValue = amount * Math.pow(1 + monthlyRate, year * 12);
            System.out.printf("%-8d%.2f%n", year, futureValue);
        }
    }

    public static void charPrint(char ch1, char ch2) {
        for (char ch = ch1; ch <= ch2; ch++) {
            System.out.print(ch + " ");
            if ((ch - ch1 + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
