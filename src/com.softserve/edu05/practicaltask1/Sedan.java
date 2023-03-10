package com.softserve.edu05.practicaltask1;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    String run() {
        return "Sedan run!";
    }

    @Override
    String stop() {
        return "Sedan stop!";
    }
}
