  /*
  * Menu
  *
  * 1.52
  *
  * 16/03/2023
  *
  * Alessandro Kadykalo
  */

package com.alekadykalo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    static{
        OperatorFile.printFromFile(OperatorFile.getWelcomeLogoFilePath());
    }
    public static void printMenu() throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        OperatorAPI operatorAPI = new OperatorAPI();
        byte choice;

        do {
            System.out.print(
                    """     
                    \n================================================================================
                            Menu options:
                            0) Exit
                            1) Get current course UAH to USD
                            2) Convert UAH to USD
                            3) Convert USD to UAH
                           
                            Choose option by entering number of option:""");


            choice = Byte.parseByte(consoleReader.readLine());

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            switch (choice) {
                case 0 -> {
                      OperatorFile.printFromFile(OperatorFile.getExitLogoFilePath());
                      choice = 0;
                }
                case 1 -> {
                    System.out.println("\nCurrent UAH to USD " + operatorAPI.getCurrentCourseUAHtoDollar());
                }
                case 2 -> {
                    System.out.print("\nCourse UAH to USD: ");
                    System.out.printf("%.4f", operatorAPI.convertUAHtoDollar(1.0));

                    System.out.print("\nEnter value of UAH: ");
                    System.out.printf("%.4f", operatorAPI.convertUAHtoDollar(Double.parseDouble(consoleReader.readLine())));

                }
                case 3 -> {
                    System.out.print("\nCourse USD to UAH: ");
                    System.out.printf("%.4f",operatorAPI.convertDollartoUAH(1.0));

                    System.out.print("\nEnter value of USD: ");
                    System.out.printf("%.4f",operatorAPI.convertDollartoUAH(Double.parseDouble(consoleReader.readLine())));
                }
                default -> {
                    System.err.println("You entered wrong menu choice! Repeat please!");
                }

            }
        }while (choice!=0);
    }
}


