package com.softserve.edu04.homework;

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
                    1.hw-task1
                    2.hw-task2
                    3.hw-task3
                    4.hw-task4
                    5.hw-task5
                    ___________________________________________________________
                    Enter your choice:""");
            choice = Byte.parseByte(br.readLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("""
                            HW TASK 1
                            Ask user to enter the number of month.
                            Read the value and write the number of days in this month
                            (create array with amount days of each month).
                            """);
                    System.out.println("Enter the number of month: ");
                    int numberMonth = Integer.parseInt(br.readLine());
                    String[] month = { "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december" };
                    int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                    System.out.println( month[numberMonth-1] + " = " +  monthDays[numberMonth-1] + "days");
                }
                case 2 -> {
                    System.out.println("""
                            HW TASK 2
                            Enter 10 integer numbers.
                            Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
                            """);
                    int[] numbers = new int[10];
                    boolean flag=true;
                    System.out.println("Enter 10 numbers: ");
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i]=Integer.parseInt(br.readLine());
                        if(i<6 && numbers[i]<0) {
                            flag = false;
                        }
                    }
                    if(flag){
                        int sum = 0;
                        for (int i = 0; i < 5; i++) {
                             sum +=numbers[i];
                        }
                        System.out.println("sum of first 5 numbers: " + sum);
                    }else{
                        int product= 1;
                        for (int i = 5; i < numbers.length; i++) {
                            product*=numbers[i];
                        }
                        System.out.println("product of last 5 numbers: " + product);
                    }
                }
                case 3 ->{
                    System.out.println("""
                            Enter 5 integer numbers.
                            Find:
                            - position of second positive number;
                            - minimum and its position in the array.
                            Count the product of all entered even numbers.
                            """);
                    int[] numbersTask3 = new int[5];
                    int counter=0;
                    int indexSecondPositiveNumber=0;
                    int indexMinimalNumber = 0;
                    int minimalNumber = Integer.MAX_VALUE;
                    int productEvenNumbers = 1;
                    System.out.println("Enter 5 numbers: ");
                    for (int i = 0; i < numbersTask3.length; i++) {
                        numbersTask3[i] = Integer.parseInt(br.readLine());
                        if (numbersTask3[i]>0 && counter < 2){
                            counter++;
                            indexSecondPositiveNumber=i;
                        }
                        if(numbersTask3[i]<minimalNumber){
                            minimalNumber = numbersTask3[i];
                            indexMinimalNumber=i;
                        }
                        if(numbersTask3[i]%2==0){
                            productEvenNumbers *= numbersTask3[i];
                        }
                    }
                    System.out.println("index of Second Positive Number: "+indexSecondPositiveNumber +
                            "\nminimal Number = " + minimalNumber + " at position "+indexMinimalNumber +
                            "\nproduct of Even Numbers = " + productEvenNumbers);
                }
                case 4 ->{
                    System.out.println("""
                            Create class Car with fields type, year of production and engine capacity.
                            Create and initialize four instances of class Car.
                            Display cars:
                            - certain model year  (enter year in the console);
                            - ordered by the field year.
                            """);
                    Car [] cars = new Car [4];
                    cars[0] = new Car("Toyota",2020,200);
                    cars[1] = new Car("BMW",2023,240);
                    cars[2] = new Car("Mitsubishi",2021,140);
                    cars[3] = new Car("Shoveler",2022,100);
                    int yearProductionChoice;
                    System.out.println("Enter year of production(2020-2023): ");
                    yearProductionChoice = Integer.parseInt(br.readLine());
                    if(yearProductionChoice>2019 && yearProductionChoice <2024){
                        for (Car car : cars) {
                            if (car.getYearProduction() == yearProductionChoice) {
                                System.out.println(car);
                            }
                        }
                    }else {
                        System.out.println("You entered year of production out of range! Try again!");
                    }
                    System.out.println("\nCars ordered by the field year of production: ");
                    Car tmp;
                    for (int i = 0; i < cars.length - 1; i++) {
                        for (int j = i + 1; j < cars.length; j++) {
                            if (cars[i].getYearProduction() < cars[j].getYearProduction()) {
                                tmp = cars[i];
                                cars[i] = cars[j];
                                cars[j]= tmp;
                            }
                        }
                    }
                    for (Object car: cars ) {
                        System.out.println(car);
                    }
                }
            }
        }while (choice!=0);
    }
}
