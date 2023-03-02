package homeWork10.StringRegex.homeWork;

import java.util.Scanner;

public class NLA {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter sentence of five words: ");
            String str = scanner.nextLine();

            String[] words = str.split(" ");

            // Find the longest word and its length
            String longestWord = words[0];
            int longestLength = longestWord.length();

            for (int i = 1; i < words.length; i++) {
                String word = words[i];
                if (word.length() > longestLength) {
                    longestWord = word;
                    longestLength = longestWord.length();
                }
            }
            System.out.println("The longest word in the sentence is: " + longestWord);
            System.out.println("It has " + longestLength + " letters.");

            // Reverse the second word
            if (words.length >= 2) {
                String secondWord = words[1];
                StringBuilder reversed = new StringBuilder(secondWord);
                reversed = reversed.reverse();
                System.out.println("The second word in reverse order is: " + reversed.toString());
            }

        }
    }
