package com.softserve.edu03.homework;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

        import static com.softserve.edu03.homework.Breed.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte choice;
        do {
            System.out.print("""
                    ___________________________________________________________
                    Menu of tasks:
                    0.Exit
                    1.homework-task1
                    2.homework-task2
                    3.homework-task3
                    4.homework-task4
                    ___________________________________________________________
                    Enter your choice:""");
            choice = Byte.parseByte(br.readLine());
            switch (choice) {
                case 1 -> {
                        System.out.println("Enter 3 float numbers and check: are they all belong eto the range [-5, 5]");
                    float inputFloat = 0;
                    int step = 0;
                    do {
                        inputFloat = Float.parseFloat(br.readLine());
                        if (!(inputFloat >= -5 && inputFloat <= 5)) {
                            System.out.println("Sorry! That's number is out of range [-5;5].");
                            step = 4;
                        }

                    } while (step < 3);
                    }

                case 2 -> {
                        System.out.println("Enter 3 integer numbers and write max and min of them");
                    int step = 0;
                    int inputInteger = Integer.parseInt(br.readLine());
                    int maxValue = inputInteger;
                    int minValue = inputInteger;
                    while (step < 2) {
                        inputInteger = Integer.parseInt(br.readLine());
                        if (inputInteger > maxValue) {
                            maxValue = inputInteger;
                        } else {
                            minValue = inputInteger;
                        }
                        step++;
                    }
                    System.out.println("max value: " + maxValue + "\nmin value: " + minValue);
                    }
                case 3 -> {
                        System.out.println("read number of HTTP Error (400, 401,402, ...) and write the name of this error(Declare enum HTTPError)");
                    int numberHTTPerror = Integer.parseInt(br.readLine());

                    HTTPError error =
                            switch (numberHTTPerror) {
                                case 400 -> HTTPError.BAD_REQUEST;
                                case 401 -> HTTPError.UNAUTHORIZED;
                                case 402 -> HTTPError.PAYMENT_REQUIRED;
                                default -> HTTPError.UNKNOWN;
                            };
                    System.out.println(error);

                    }
                case 4 -> {
                        Dog dog1 = new Dog("Rex", POODLE, 3);
                    Dog dog2 = new Dog("Bob", BULLDOG, 5);
                    Dog dog3 = new Dog("Limbo", ROTTWEILER, 2);

                    System.out.println("Is Dogs Name Equal? " + dog1.isDogsNameEqual(dog2.isDogsNameEqual(dog3)));
                    System.out.println("Name and kind of the oldest dog: " + dog1.nameKindOldestDog(dog2.nameKindOldestDog(dog3)));
                    }
            }
        }
        while (choice != 0);

    }
}

enum HTTPError {
    BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, UNKNOWN
}