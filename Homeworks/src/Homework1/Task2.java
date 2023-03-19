package Homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String name;
        String address;
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Where are you live, " + name + "?");
        address = input.nextLine();
        System.out.println("Your name is " + name + ". You live in " + address);
    }
}
