package com.softserve.edu10.hwtask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(
                """
                HW TASK 1
                Enter in the console sentence of five words.
                - display the longest word in the sentence, determine the number of its letters
                - bring the second word in reverse order""");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter sentence of five words: ");
        String sentence = br.readLine();
        String[] words = sentence.split(" ");

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
    }
}

