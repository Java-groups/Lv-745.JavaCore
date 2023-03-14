package com.softserve.edu02.practical;

class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum;

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    Employee() {}

    Employee(String name, double rate) {
        this.setName(name);
        this.setRate(rate);
    }

    Employee(String name, double rate, double hours) {
        this.setName(name);
        this.setRate(rate);
        this.setHours(hours);
    }

    public double getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee " + name + " has rate " + rate + " and hours " + hours;
    }

    public double getBonus() {
        return getSalary() * 0.10;
    }

}