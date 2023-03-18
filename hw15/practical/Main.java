import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            byte choice;

        do {
            System.out.print("""
                    ___________________________________________________________
                    PRACTICAL TASKS:
                    0)Exit
                    1)Prepare mytext.txt file with a lot of text inside.
                           Read context from file into array of strings.
                           Each array item contains one line from file.
                           Complete next tasks:
                             1.1) count and write the number of symbols in every line.
                             1.2) find the longest and the shortest line.
                             1.3) find and write only that lines, which consist of word «var»
                    2)Prepare a file with text:
                             2.1) find and output to the console all words starting with a vowel.
                             2.2) find and output to the console all words for which the last letter
                                 of one word matches the first letter of the next word.
                    ___________________________________________________________
                    Enter your choice:""");

            choice = Byte.parseByte(br.readLine());
            switch (choice) {
                //PRACTICAL TASK 1
                case 1 -> {
                    String filePath = "./hw15/txtfiles/mytext.txt";
                    List<String> lines = new ArrayList<>();

                    try (BufferedReader filePointer = new BufferedReader(new FileReader(filePath))) {
                        String line;
                        while ((line = filePointer.readLine()) != null) {
                            lines.add(line);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println("\n1.1)number of symbols in every line: ");
                    for (String line : lines) {
                        System.out.println(line.length());
                    }

                    System.out.println("\n1.2)longest and shortest line: ");
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
                    System.out.println(longestLine + "\n" + shortestLine);

                    System.out.println("\n1.3)lines with word \"var\": ");
                    Pattern pattern = Pattern.compile("\\bvar\\b");
                    for (String line : lines) {
                        if (pattern.matcher(line).find()) {
                            System.out.println(line);
                        }
                    }

                }
                //PRACTICAL TASK 2
                case 2 -> {
                    String filePath = "./hw15/txtfiles/mytext.txt";
                    List<String> words = new ArrayList<>();

                    try (BufferedReader filePointer = new BufferedReader(new FileReader(filePath))) {
                        String line;
                        while ((line = filePointer.readLine()) != null) {
                            String[] splittedLine = line.split("\\s+");
                            Collections.addAll(words, splittedLine);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    System.out.println("\n===========\n2.1)All words starting with a vowel: ");
                    for (String word : words) {
                        if (word.matches("[aeiouAEIOU]\\w*")) {
                            System.out.println(word);
                        }
                    }

                    System.out.println("\n===========\n2.2)All words where last letter matches the first letter of the next word: ");
                    for (int i = 0; i < words.size() - 1; i++) {
                        String currentWord = words.get(i);
                        String nextWord = words.get(i + 1);
                        if (currentWord.charAt(currentWord.length() - 1) == nextWord.charAt(0)) {
                            System.out.println(currentWord + " " + nextWord);
                        }
                    }
                }
                default -> {
                    System.out.println("Wrong menu choice! Repeat input!");
                }
            }
        }
        while (choice != 0);
    }
}
