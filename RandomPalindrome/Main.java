public class Main {
    public static void main(String[] args) {

        int therandomnumber = (int)(Math.random() * 100000);
        String numberstring = String.valueOf(therandomnumber);

        String reversedStr = new StringBuilder(numberstring).reverse().toString();
        boolean isitapalindrome = numberstring.equals(reversedStr);

        System.out.println("random: " + therandomnumber);
        System.out.println("palindrome? " + isitapalindrome);
    }
}
