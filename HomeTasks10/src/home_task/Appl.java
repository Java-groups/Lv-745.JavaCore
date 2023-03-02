package home_task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        operationsWithString();

        validateSpaces();

        validateCurrency();
    }

    public static void operationsWithString() {

        System.out.print("Enter the sentence of 5+ words ");
        String sentence = sc.nextLine();

        int length = 0;
        String longestword = null;

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (length < word.length()) {
                length = word.length();
                longestword = word;
            }
        }

        StringBuilder secondword = new StringBuilder(words[1]);

        System.out.println("The longest word: " + longestword + ", length: " + length);
        System.out.println("reversed 2nd word: " + secondword.reverse());
    }

    public static void validateSpaces() {

        System.out.println("Enter the sentence with spaces");
        String sentence = sc.nextLine();

        String regex = "\s+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        String result = matcher.replaceAll(" ").replace("I am", "I'm");
        System.out.println("Result after replacing and removing spaces: " +result);
    }

    public static void validateCurrency() {
        System.out.println("Enter the currency, starting with $");
        String currency = sc.nextLine();

        String regex = "\\$\\d+\\.*\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(currency);
        if ( matcher.matches()){
            System.out.println("Valid : " +currency);
        } else {
            System.out.println("Invalid : " +currency);
        }
    }
}
