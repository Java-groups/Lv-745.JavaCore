package com.softserve.edu05.practicaltask1;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Car(){}

    public Car (String model,int maxSpeed,int yearOfManufacture){
        setModel(model);
        setMaxSpeed(maxSpeed);
        setYearOfManufacture(yearOfManufacture);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + getModel() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", yearOfManufacture=" + getYearOfManufacture() +
                '}';
    }

    abstract String run();
    abstract String stop();
}
