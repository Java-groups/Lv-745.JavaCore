package com.softserve.edu02.example;

class Student {
    private String name;
    private double rating;

    static double totalRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    Student() {}

    Student(String name, double rating) {
        this.setName(name);
        this.setRating(rating);
    }

    public static double avgRating(double...array) {
        totalRating = array[0];
        for (int step = 1; step < array.length; step++) {
            totalRating += array[step];
        }
        return totalRating / array.length;
    }
    public boolean betterStudent(Student firstOne, Student secondOne) {
        return (firstOne.rating > secondOne.rating) ? true : false;
    }

    @Override
    public String toString() {
        return name + " has rating " + rating;
    }
}