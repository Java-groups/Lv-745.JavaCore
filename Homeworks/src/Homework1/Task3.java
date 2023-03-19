package Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double cost1 = 2.5;
        double cost2 = 3.5;
        double cost3 = 4.0;
        System.out.println("Please enter duration of the call to the first country?");
        Scanner input = new Scanner(System.in);
        int time1 = input.nextInt();
        System.out.println("Please enter duration of the call to the second country?");
        int time2 = input.nextInt();
        System.out.println("Please enter duration of the call to the third country?");
        int time3 = input.nextInt();
        double price1 = cost1 * time1;
        double price2 = cost2 * time2;
        double price3 = cost3 * time3;
        double totalPrice = price1 + price2 + price3;
        System.out.println("Price of call to first country is " + price1);
        System.out.println("Price of call to second country is " + price2);
        System.out.println("Price of call to third country is " + price3);
        System.out.println("Total price is " + totalPrice);
    }
}