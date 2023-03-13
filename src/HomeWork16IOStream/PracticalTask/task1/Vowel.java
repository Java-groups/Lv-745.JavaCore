package HomeWork16IOStream.PracticalTask.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Vowel {
    public static void main(String[] args) throws IOException {
        File file = new File("file1.txt");
        try {


            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            ArrayList<String> words = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    if (word.matches("^[aeioAEIOU].*")) {
                        words.add(word);
                    }
                }
            }
            for (String word : words) {
                System.out.println(word);
            }
            br.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
