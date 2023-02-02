import Continent.Country;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // odd numbers
        Scanner sc = new Scanner(System.in);
        Numbers number = new Numbers();
        System.out.print("Enter how many numbers you want to check");
        int i;
        int count = sc.nextInt();
        for (i = 1; i < (count + 1); i++) {
            System.out.print("Enter " + i + " number");
            number.setNumber(sc.nextInt());
        }

        System.out.println("From these numbers are " + Numbers.getCount() + " odd numbers");


        // Enum

        Days day1 = Days.Monday;
        Days day2 = Days.Tuesday;
        Days day3 = Days.Wednesday;
        Days day4 = Days.Thursday;
        Days day5 = Days.Friday;
        Days day6 = Days.Saturday;
        Days day7 = Days.Sunday;

        System.out.print("Enter the number of day of the week: ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> {
                System.out.println(day1.getEn());
                System.out.println(day1.getUa());
            }
            case 2 -> {
                System.out.println(day2.getEn());
                System.out.println(day2.getUa());
            }
            case 3 -> {
                System.out.println(day3.getEn());
                System.out.println(day3.getUa());
            }
            case 4 -> {
                System.out.println(day4.getEn());
                System.out.println(day4.getUa());
            }
            case 5 -> {
                System.out.println(day5.getEn());
                System.out.println(day5.getUa());
            }
            case 6 -> {
                System.out.println(day6.getEn());
                System.out.println(day6.getUa());
            }
            case 7 -> {
                System.out.println(day7.getEn());
                System.out.println(day7.getUa());
            }
            default -> System.out.println("Wrong number of the day of the week");
        }

        //Enum Continents

        Country country1 = Country.China;
        Country country2 = Country.Ethiopia;
        Country country3 = Country.France;
        Country country4 = Country.UnitedStates;
        Country country5 = Country.Antarctica;
        System.out.println("The " + country1 + " is located in " + country1.getContinent());
        System.out.println("The " + country2 + " is located in " + country2.getContinent());
        System.out.println("The " + country3 + " is located in " + country3.getContinent());
        System.out.println("The " + country4 + " is located in " + country4.getContinent());
        System.out.println("The " + country5 + " is located in " + country5.getContinent());

        // Product

        Product product1 = new Product("Шарфек", 200, 25);
        Product product2 = new Product("Шапочка", 200, 10);
        Product product3 = new Product("Курточка",1500, 2);
        Product product4 = new Product("Кросівки",1200,1);

    }
}
