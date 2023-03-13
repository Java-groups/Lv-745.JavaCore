package HomeWork16IOStream.HomeWork.Files;

import java.io.*;

public class txt {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("first10.txt");
            fileWriter.write("Мене звуть Роман.Працював на посаді Директора магазину з 2022 року\n");
            fileWriter.write("До цього працював Фітнес тренером, та тренером з боротьби.\n");
            fileWriter.write("на даний момент безробній))))\n");
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("first10.txt"));
            String [] lines = bufferedReader.lines().toArray(String[]::new);

            int numLines = lines.length;

            String longestLine = "";
            for (String line : lines){

                if (line.length() > longestLine.length()){
                    longestLine = line;
                }
            }
       String nameAndBirth = " Roman : 23.03.1999";
            FileWriter fileWriter = new FileWriter("file11.txt");
            fileWriter.write("Number of lines in file10.txt " + numLines + "\n");
            fileWriter.write("Longest line in file10" + longestLine + "\n");
            fileWriter.write("Name and birth date " + nameAndBirth + "\n");
            fileWriter.close();
            bufferedReader.close();
        }  catch(IOException e){
            e.printStackTrace();
        }
    }
}
