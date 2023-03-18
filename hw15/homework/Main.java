import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte choice;

        do {
            System.out.print("""
                    ___________________________________________________________
                    HOMEWORK TASKS:
                    0)Exit
                    1)Create file1.txt file with a text about your career.
                      Read context from file into array of strings. Each array item contains one line from file.
                      Write in to the file2.txt
                         1.1) number of lines in file1.txt.
                         1.2) the longest line in file1.txt.
                         1.3) your name and birthday date.\s
                    2)A file with java code is given.
                    Read program text from file and all words public in the declaration of class attributes
                    and methods should be replaced with the word private.
                     Save the result to another previously created file.
                    ___________________________________________________________
                    Enter your choice:""");

            choice = Byte.parseByte(br.readLine());
            switch (choice) {
                //PRACTICAL TASK 1
                case 1 -> {
                    String filePath = "./hw15/txtfiles/file1.txt";
                    List<String> lines = new ArrayList<>();

                    try (BufferedReader filePointerReader = new BufferedReader(new FileReader(filePath))) {
                        String line;
                        while ((line = filePointerReader.readLine()) != null) {
                            lines.add(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    try (BufferedWriter filePointerWriter = new BufferedWriter(new FileWriter("./hw15/txtfiles/file2.txt"))) {

                        filePointerWriter.write("1.1)number of lines in file1.txt: " +  lines.size());
                        filePointerWriter.newLine();

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

                        filePointerWriter.write("1.2) the longest line in file1.txt: " + longestLine);
                        filePointerWriter.newLine();

                        filePointerWriter.write("1.3) " + fullname + " " + birthday);

                        System.out.println("Recorded data into file2.txt");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                //PRACTICAL TASK 2
                case 2 -> {
                    String sourceFilePath = "./hw15/txtfiles/source.java";
                    String outputFilePath = "./hw15/txtfiles/output.java";

                    StringBuilder linesContainer = new StringBuilder();
                    try (BufferedReader filePointerReader = new BufferedReader(new FileReader(sourceFilePath))) {
                        String line;
                        while ((line = filePointerReader.readLine()) != null) {
                            linesContainer.append(line).append("\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    Matcher matcher = Pattern.compile("public").matcher(linesContainer.toString());
                    String outputText = matcher.replaceAll("private");

                    try (BufferedWriter filePointerWriter = new BufferedWriter(new FileWriter(outputFilePath))) {
                        filePointerWriter.write(outputText);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Recorded data into output.java");
                }
                default -> {
                    System.out.println("Wrong menu choice! Repeat input!");
                }
            }
        }
        while (choice != 0);
    }
}
