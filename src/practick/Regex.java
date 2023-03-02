package practick;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
        public static void main (String[]args){

            String pattern = "\\$\\d+\\.?\\d{0,2}";

            // Read input from the console
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter some text: ");
            String text = scanner.nextLine();
            scanner.close();

            // Find all occurrences of the pattern in the input
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher matcher = pattern1.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        }
    }


