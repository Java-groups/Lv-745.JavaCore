package pt2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Read contents of file into a single string
        String text = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\melba\\OneDrive - ПАТ Укрнафта\\Робочий стіл\\mytext.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                text += line + "\n";
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Find and output all words starting with a vowel
        String[] words = text.split("\\s+");
        for (String word : words) {
            char firstLetter = word.charAt(0);
            if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
                System.out.println(word);
            }
        }

        // Find and output all words for which the last letter of one word matches the first letter of the next word
        for (int i = 0; i < words.length - 1; i++) {
            char lastLetter = words[i].charAt(words[i].length() - 1);
            char firstLetter = words[i+1].charAt(0);
            if (lastLetter == firstLetter) {
                System.out.println(words[i] + " " + words[i+1]);
            }
        }

    }
}
