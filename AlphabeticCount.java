public class AlphabeticCount {
    public static void main(String[] args) {
        int[] sizes = {26, 260, 26000};

        for (int size : sizes) {
            char[] randomChars = new char[size];
            int[] counts = new int[26];

            for (int i = 0; i < size; i++) {
                randomChars[i] = (char) ((int) (Math.random() * 26) + 'a');
                counts[randomChars[i] - 'a']++;
            }

            System.out.println("Size: " + size);
            for (int i = 0; i < counts.length; i++) {
                System.out.println((char) (i + 'a') + ": " + counts[i] + " (" + String.format("%.2f", 100.0 * counts[i] / size) + "%)");
            }
        }
    }
}
