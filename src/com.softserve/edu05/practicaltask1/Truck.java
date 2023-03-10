package com.softserve.edu05.practicaltask1;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    String run() {
        return "Truck run!";
    }

    @Override
    String stop() {
        return "Truck stop!";
    }
}