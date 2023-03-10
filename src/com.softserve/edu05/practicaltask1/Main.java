package com.softserve.edu05.practicaltask1;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                  """
                  PRACTICAL TASK 1
                  Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
                  Develop classes Truck and Sedan which extend class Car.
                  In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it.
                  """);
        Car[] cars = new Car[4];
        cars[0]=new Sedan("BMW",180,2021);
        cars[1]=new Sedan("Sprinter",150,2020);
        cars[2]=new Truck("Scania",130,2022);
        cars[3]=new Truck("DAF",100,2003);
        System.out.println("Info about cars: ");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
