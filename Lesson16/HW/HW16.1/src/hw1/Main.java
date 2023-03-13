package hw1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create file1.txt file with a text about my career.
        try {
            FileWriter fileWriter = new FileWriter("file1.txt");
            fileWriter.write("I am a geologist.\n");
            fileWriter.write("I started working at my job in 2007.\n");
            fileWriter.write("I am currently studying Java.\n");
            fileWriter.write("I hope to change my profession.\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read contents of file1.txt into array of strings
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write to file2.txt
        try {
            FileWriter fileWriter = new FileWriter("file2.txt");
            fileWriter.write("Number of lines in file1.txt: " + lines.size() + "\n");
            String longestLine = lines.stream().max(Comparator.comparingInt(String::length)).orElse("");
            fileWriter.write("Longest line in file1.txt: " + longestLine + "\n");
            fileWriter.write("My name is Liubov and my birthday date is 28.08.1985.\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
