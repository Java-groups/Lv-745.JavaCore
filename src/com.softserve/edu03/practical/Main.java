package com.softserve.edu03.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte choice;
        do {
            System.out.print("""
                    ___________________________________________________________
                    Menu of tasks:
                    0.Exit
                    1.practical-task1
                    2.practical-task2
                    3.practical-task3
                    4.practical-task4
                    ___________________________________________________________
                    Enter your choice:""");
            choice = Byte.parseByte(br.readLine());
            switch (choice) {
                case 1 -> {
                    //1. Enter three numbers. Find out how many of them are odd
                    System.out.println("Enter three int numbers, each by new line: ");
                    int counter = 0;
                    for (int step = 0; step < 3; step++) {
                        int number = Integer.parseInt(br.readLine());
                        if (number % 2 != 0) {
                            counter++;
                        }
                    }
                    System.out.println("We have " + counter + " odd numbers!");
                }
                case 2 -> {
                    //2.Enter the number of the day of the week. Display the name in two languages
                    System.out.println("Enter number of the day of the week: ");
                    int numOfDay = Integer.parseInt(br.readLine());
                    String result = switch (numOfDay) {
                        case 1 -> "Monday , Понеділок";
                        case 2 -> "Tuesday , Вівторок";
                        case 3 -> "Wednesday , Середа";
                        case 4 -> "Thursday , Четвер";
                        case 5 -> "Friday , П`ятниця";
                        case 6 -> "Saturday , Субота";
                        case 7 -> "Sunday , Неділя";
                        default -> "Wrong number of week day!";
                    };
                    System.out.println(result);
                }
                case 3 -> {
                  //3. Enter the name of the country. Print the name of the continent(Declare enum with names of continents)
                    System.out.println("Enter the name of the country: ");
                    String country = br.readLine().toLowerCase();

                    Continents continent = switch (country) {
                        case "ukraine", "poland" -> Continents.EUROPE;
                        case "china", "japan" ->  Continents.ASIA;
                        case "nigeria", "egypt" -> Continents.AFRICA;
                        default -> Continents.UNKNOWN;
                    };
                    System.out.println(continent);

                }
                case 4 -> {
                     Product obj1 = new Product("baluk",300,2);
                     Product obj2 = new Product("ball",70,5);
                     Product obj3 = new Product("lego",55,3);
                     Product obj4 = new Product("hammer",105,4);

                     System.out.println("Most Expensive Item: " + obj1.mostExpensiveItem(obj2.mostExpensiveItem(obj3.mostExpensiveItem(obj4))));
                     System.out.println("Most Items Quantity: " + obj1.mostItemsQuantity(obj2.mostItemsQuantity(obj3.mostItemsQuantity(obj4))));
                }
            }
        }while (choice!=0);
    }
}

enum Continents {
    ASIA, AFRICA, EUROPE, UNKNOWN
}