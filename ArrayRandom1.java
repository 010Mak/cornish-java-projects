import java.util.Random;

public class ArrayRandom1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] values = new int[15];

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(26);  // Generate a random number between 0 and 25
        }

        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
