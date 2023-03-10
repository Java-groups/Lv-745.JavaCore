package com.softserve.edu05.hwtask1;

public class NonFlyingBird extends Bird{
    @Override
    void fly() {
        System.out.println("Bird can't fly.");
    }
}
