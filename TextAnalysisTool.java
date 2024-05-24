import java.io.*;
import java.util.*;

public class TextAnalysisTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("goofy ahh uncle productions text anal-izer idek");

        System.out.print("enter filename: ");
        String filename = scanner.nextLine();
        String content = loadFileContent(filename);
        if (content == null) {
            return;
        }

        System.out.println("word count: " + countWords(content));

        System.out.println("type ze letter or phrase ze u want");
        String choice = scanner.nextLine();

        if ("letter".equalsIgnoreCase(choice)) {
            Map<Character, Integer> frequency = letterFrequencyAnalysis(content);
            frequency.forEach((k, v) -> System.out.println(k + ": " + v));
        } else if ("phrase".equalsIgnoreCase(choice)) {
            System.out.print("enter ze character name");
            String character = scanner.nextLine();
            int count = countPhrasesByCharacter(content, character);
            System.out.println(character + " spoke " + count + " phrases.");
        } else {
            System.out.println("nuh uhhhhh");
        }

        scanner.close();
    }

    private static String loadFileContent(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        } catch (IOException e) {
            System.out.println("error " + e.getMessage());
            return null;
        }
    }

    private static int countWords(String content) {
        return content.split("\\s+").length;
    }

    private static Map<Character, Integer> letterFrequencyAnalysis(String content) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : content.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                frequency.put(c, frequency.getOrDefault(c, 0) + 1);
            }
        }
        return frequency;
    }

    private static int countPhrasesByCharacter(String content, String character) {
        int count = 0;
        boolean isCharacterSpeaking = false;
        for (String line : content.split("\n")) {
            if (line.startsWith(character + ":")) {
                isCharacterSpeaking = true;
            } else if (line.isEmpty() || line.matches("^[A-Z ]+:")) {
                isCharacterSpeaking = false;
            }
            if (isCharacterSpeaking) {
                count++;
            }
        }
        return count;
    }
}
