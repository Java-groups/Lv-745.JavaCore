package com.softserve.edu01.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte choice;
        do {
            System.out.print("""
                ___________________________________________________________
                Menu of tasks:
                0.Exit
                1.hw-task1
                2.hw-task2
                3.hw-task3
                ___________________________________________________________
                Enter your choice:""");
            choice = Byte.parseByte(br.readLine());
            switch (choice) {
                case 1 -> {
                    HwTask1 obj = new HwTask1();
                    obj.readRadius();
                    DecimalFormat ft = new DecimalFormat("#####.##");
                    System.out.println("Flower bed perimetr: " + ft.format(obj.calculatePerimeter()) + "\narea: " + ft.format(obj.calculateArea()));
                    }
                case 2 -> {
                    HwTask2 obj = new HwTask2();
                    System.out.println(obj.readNameAndAddress());
                    }
                case 3 -> {
                    HwTask3 obj = new HwTask3();
                    obj.readTimeOfCall();
                    System.out.println(obj.countUnits());
                    }
            }
        }
        while (choice != 0);
    }
}