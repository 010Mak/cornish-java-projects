import java.util.Scanner;

public class OhmFinder {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String[] colorBand = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] digit = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


      
        System.out.println("enter the color of your 1st band");
        String firstBand = kb.next().toLowerCase();

        System.out.println("enter the color of your 2nd band");
        String secondBand = kb.next().toLowerCase();

        System.out.println("enter the color of your 3rd band");
        String thirdBand = kb.next().toLowerCase();



      
        int firstDigit = findColorIndex(firstBand, colorBand);
        int secondDigit = findColorIndex(secondBand, colorBand);
        int thirdDigit = findColorIndex(thirdBand, colorBand);

        if (firstDigit >= 0 && secondDigit >= 0 && thirdDigit >= 0) {
            long resistance = (long)((firstDigit * 10 + secondDigit) * Math.pow(10, thirdDigit));
            System.out.println(resistance + " Ω");
        } else {
            System.out.println("wrong color silly");
        }

        kb.close();
    }

    private static int findColorIndex(String color, String[] colorBand) {
        for (int i = 0; i < colorBand.length; i++) {
            if (colorBand[i].equalsIgnoreCase(color)) {
                return i;
            }
        }
        return -1; 
    }
}
