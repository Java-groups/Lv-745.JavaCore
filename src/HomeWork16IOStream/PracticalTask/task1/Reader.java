package HomeWork16IOStream.PracticalTask.task1;

import java.io.*;

public class Reader {

    public static void main(String[] args) throws IOException {
        File file = new File("file1.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int lineCount = 0;
            int shortestLine = Integer.MAX_VALUE;
            int longestLine = Integer.MIN_VALUE;
            while ((line = br.readLine()) != null) {
                lineCount++;
                int lineLenght = line.length();
//                System.out.println("Line " + lineCount + " have " + lineLenght + "Symbol");

                if (lineLenght < shortestLine) {
                    shortestLine = lineLenght;
                }
                if (lineLenght > longestLine) {
                    longestLine = lineLenght;
                }
                if (line.contains("var") ) {
                    System.out.println(line);
                }
//                }else {
//                    System.out.println("немає слів які повторяються");
//                }
            }
            System.out.println("The shortest line have " + shortestLine + " symbol");
            System.out.println("The longest line have " + longestLine + " symbol");
            br.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}




