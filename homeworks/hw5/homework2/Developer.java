package com.softserve.edu05.hwtask2;

public class Developer extends Employee{
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        setPosition(position);
    }
    @Override
    public String report (){
        return String.format("Name: %s, Age: %d, Position: %s, Salary: \u20b4 %.2f.", getName(), getAge(), getPosition(), getSalary());
    }
}
