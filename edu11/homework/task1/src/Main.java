import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        do {
            System.out.print("Enter a sentence of five words: ");
            sentence = scanner.nextLine();
            String[] words = sentence.split("\\s+");
            if (words.length != 5) {
                System.out.println("Error: Sentence must contain exactly five words.");
            } else {
                break;
            }
        } while (true);

        String[] words = sentence.split("\\s+");

        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of longest word: " + longestWord.length());

        StringBuilder secondWord = new StringBuilder(words[1]);
        secondWord.reverse();

        System.out.println("Second word in reverse order: " + secondWord);
    }
}