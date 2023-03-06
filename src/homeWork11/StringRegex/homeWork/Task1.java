package homeWork11.StringRegex.homeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = scanner.nextLine();
        String words[] = str.split(" ");
        // ============ Longest word

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


        //==========REVERSE

        if (words.length >= 2) {
            String secondWord = words[1];
            StringBuilder reversedWord = new StringBuilder(secondWord).reverse();
            reversedWord = reversedWord.reverse();
            System.out.println("The second word in reverse order is: " + reversedWord);

        }



        // ================ task 2



        System.out.print("Enter a sentence with extra spaces: ");
        String sentence = scanner.nextLine();

        sentence = sentence.replaceAll("\\s+", " ");

        System.out.println("Fixed sentence: " + sentence);






        /// ================ task 3


        System.out.println("===================task 3");

        System.out.print("Enter some text with US currency: ");
        String text = scanner.nextLine();
            try {


        Pattern pattern = Pattern.compile("\\$\\d+(\\.\\d{2})?");
        Matcher matcher = pattern.matcher(text);

        System.out.println("US currency found:");
        if (matcher.find()){
            System.out.println(matcher.group(pattern.flags()) + "*");
        }else System.out.println("Enter number which started from :'$' and sum with dot. for example $1456.35");
            }catch (Exception e){
            }
        }
    }





