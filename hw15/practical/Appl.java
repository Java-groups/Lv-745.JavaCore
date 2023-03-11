import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    private static void taskOne(){
        String filePath = "./hw15/files/mytext.txt";
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Something went wrong. Unable read the file.");
            return;
        }

        System.out.println("-------TASK 1.1 Count and write the number of symbols in every line-------");
        for (String line : lines) {
            System.out.println(line.length());
        }

        System.out.println("-------TASK 1.2 Find the longest and shortest line-------");
        String shortestLine = lines.get(0);
        String longestLine = lines.get(0);
        for (String line : lines) {
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            }
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        System.out.println("Shortest line: " + shortestLine);
        System.out.println("Longest line: " + longestLine);

        System.out.println("-------TASK 1.3 Find and write only that lines which consist of word \"var\"-------");
        String regex = "\\bvar\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (String line : lines) {
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                System.out.println(line);
            }
        }

    }
    private static void taskTwo() {
        String filePath = "./hw15/files/mytext.txt";

        // Read the contents of the file into an array of strings
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split each line into words
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    words.add(word);
                }
            }
        } catch (IOException e) {
            System.err.println("Something went wrong. Unable read the file.");
            return;
        }

        System.out.println("-------TASK 2.1 Find and output to the console all words starting with a vowel-------");
        for (String word : words) {
            if (word.matches("[aeiouAEIOU]\\w*")) {
                System.out.println(word);
            }
        }
        System.out.println("-------TASK 2.2 Find and output to the console all words for which the last letter of one word\n " +
                "matches the first letter of the next word. -----");
        for (int i = 0; i < words.size() - 1; i++) {
            String currentWord = words.get(i);
            String nextWord = words.get(i + 1);
            if (currentWord.charAt(currentWord.length() - 1) == nextWord.charAt(0)) {
                System.out.println(currentWord + " " + nextWord);
            }
        }
    }
}
