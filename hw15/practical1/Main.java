package practical1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(
                """
                PRACTICAL TASK
                Prepare mytext.txt file with a lot of text inside.
                Read context from file into array of strings.
                Each array item contains one line from file.
                Complete next tasks:
                1) count and write the number of symbols in every line.
                2) find the longest and the shortest line.
                3) find and write only that lines, which consist of word «var»
                """);


        String filePath = "./hw15/txtfiles/mytex.txt";
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("\n1)number of symbols in every line: ");
        for (String line : lines) {
            System.out.println(line.length());
        }


        System.out.println("\n2)longest and shortest line: ");
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


        System.out.println("\n3)lines with word \"var\": ");
        Pattern pattern = Pattern.compile("\\bvar\\b");
        for (String line : lines) {
            if (pattern.matcher(line).find()) {
                System.out.println(line);
            }
        }

    }
}
