import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------TASK ONE. Create two methods String encrypt and String decrypt. ----------");
        taskOne();
        System.out.println("--------TASK TWO. A file with java code is given. ----------");
        taskTwo();
    }
    private static void taskOne(){
        String filePath = "./hw15/files/file1.txt";
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./hw15/files/file2.txt"))) {
            int numLines = lines.size();
            bw.write("Number of lines in file1.txt: " + numLines);
            bw.newLine();
            String longestLine = "";
            String fullname = "";
            String birthday = "";
            for (String line : lines) {
                if (line.length() > longestLine.length()) {
                    longestLine = line;
                }
                if (line.contains("Full Name")) {
                    fullname = line;
                }
                if (line.contains("Birthday")) {
                    birthday = line;
                }
            }
            bw.write("Longest line in file1.txt: " + longestLine);
            bw.newLine();
            bw.write(fullname);
            bw.newLine();
            bw.write(birthday);
            System.out.println("All info was recorded in file2.txt");
        } catch (IOException e) {
            System.err.println("Something went wrong. Unable read the file.");
        }
    }

    private static void taskTwo(){
        String sourceFilePath = "./hw15/files/source.java";
        String destinationFilePath = "./hw15/files/destination.java";

        String inputText = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                inputText += line + "\n";
            }
        } catch (IOException e) {
            System.err.println("Something went wrong. Unable read the file.");
            return;
        }
        Pattern pattern = Pattern.compile("public");
        Matcher matcher = pattern.matcher(inputText);
        String outputText = matcher.replaceAll("private");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))) {
            writer.write(outputText);
        } catch (IOException e) {
            System.err.println("Something went wrong. Unable write the file.");
        }
        System.out.println("destination.java was updated.");
    }
}
