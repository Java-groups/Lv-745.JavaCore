  /*
   * OperatorFile
   *
   * 1.52
   *
   * 16/03/2023
   *
   * Alessandro Kadykalo
   */

package com.alekadykalo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class OperatorFile {

    private static final String welcomeLogoFilePath = "./graduationproject/src/main/resources/txtfiles/welcomelogo.txt";
    private static final String exitLogoFilePath = "./graduationproject/src/main/resources/txtfiles/exitlogo.txt";

    public static String getWelcomeLogoFilePath() {
        return welcomeLogoFilePath;
    }

    public static String getExitLogoFilePath() {
        return exitLogoFilePath;
    }

    public static void printFromFile(String filePath) {

        List<String> lines = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String line : lines) {
            System.out.println(line);
        }

    }

}
