package com.softserve.edu05.hwtask2;
public class Employee {
    private String name;
    private int age;
    private double salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(){}
    public Employee(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String report (){
        return String.format("Name: %s, Age: %d, Salary: \u20b4 %.2f.",getName(), getAge(), getSalary());
    }
}
