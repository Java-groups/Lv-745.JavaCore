package pt1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Read contents of mytext.txt into array of strings
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\melba\\OneDrive - ПАТ Укрнафта\\Робочий стіл\\mytext.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Count and write number of symbols in every line
        List<Integer> symbolCounts = new ArrayList<>();
        for (String line : lines) {
            int count = line.length();
            symbolCounts.add(count);
        }
        try {
            FileWriter writer = new FileWriter("results.txt");
            for (int i = 0; i < lines.size(); i++) {
                writer.write("Line " + (i + 1) + " has " + symbolCounts.get(i) + " symbols.\n");
            }
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Find longest and shortest line
        String longestLine = "";
        String shortestLine = lines.get(0);
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            }
        }
        try {
            FileWriter writer = new FileWriter("results.txt", true);
            writer.write("Longest line: " + longestLine + "\n");
            writer.write("Shortest line: " + shortestLine + "\n");
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Find and write lines that contain the word "var"
        List<String> varLines = new ArrayList<>();
        for (String line : lines) {
            if (line.contains("var")) {
                varLines.add(line);
            }
        }
        try {
            FileWriter writer = new FileWriter("results.txt", true);
            writer.write("Lines that contain the word \"var\":\n");
            for (String line : varLines) {
                writer.write(line + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
