package Homework4_Loops.Task4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("BMW", 2018, 3.5);
        cars[1] = new Car("Suzuki", 2020, 2.0);
        cars[2] = new Car("Tesla", 2018, 3.0);
        cars[3] = new Car("MINI", 2021, 4.5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a production year of a car: ");
        int year = sc.nextInt();
        for (int i = 0; i < cars.length; i++) {
            if (year == cars[i].getProdYear()) {
                System.out.println(cars[i]);
            }
        }
        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getProdYear() < cars[j].getProdYear()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        System.out.println("\nCar sorting based on production year:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
