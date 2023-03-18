import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(
                """
                HW TASKS
                1)Enter in the console sentence of five words.
                  - display the longest word in the sentence, determine the number of its letters
                  - bring the second word in reverse order
                2)Enter a sentence that contains the words between more than one space.
                Convert all spaces, consecutive, one.
                For example, if we introduce the sentence "I    am      learning     Java     Core», we have to get the "I'm learning Java Core»
                3)Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and two digits after the dot.
                Enter the text from the console that contains several occurrences of US currency.
                Display all occurrences on the screen
                """);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //HW TASK 1
        System.out.print("Enter sentence of five words: ");
        String sentenceFiveWords = br.readLine();
        String[] words = sentenceFiveWords.split(" ");
        String longestWord="";
        int maximalWordLength = 0;
        for (String word : words) {
            if (word.length() > maximalWordLength) {
                maximalWordLength = word.length();
                longestWord = word;
            }
        }
        if (maximalWordLength==0){
            System.out.println("There is no words in sentence!");
        }else{
            System.out.println( "Longest word: " + longestWord + "\nNumber of its letters: " + longestWord.length());

            String secondWord = words[1];
            StringBuilder reversedSecondWord = new StringBuilder(secondWord).reverse();
            System.out.println("Second word reversed: " + reversedSecondWord);
        }


        //HW TASK 2
        System.out.print("\nEnter a sentence that contains the words between more than one space: ");
        String sentenceMultipleSpaces = br.readLine();
        String sentenceWithoutConsecutiveSpaces = sentenceMultipleSpaces.replaceAll("\\s+", " ");
        System.out.println("Sentence after removing consecutive spaces: " + sentenceWithoutConsecutiveSpaces);


        //HW TASK 3
        System.out.print("\nEnter text containing several occurrences of US currency: ");
        String textUScurrency = br.readLine();
        Matcher matcher = Pattern.compile("\\$\\d+\\.\\d{2}").matcher(textUScurrency);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}

