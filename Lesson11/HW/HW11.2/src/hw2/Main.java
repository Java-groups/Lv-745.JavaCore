package hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        // Replace all consecutive spaces with a single space
        String modifiedSentence = sentence.replaceAll("\\s+", " ");

        modifiedSentence = modifiedSentence.replaceAll("\\bam\\b", "'m");

        // Output the modified sentence
        System.out.println(modifiedSentence);

    }
}
