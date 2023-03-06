package homeWork4ConditionsStatements.practicalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("======== Task 1 ========");
        //===== Task 1 ======
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int oddCount = 0;
        if (number1 % 2 !=0){
            oddCount++;
        }if (number2 % 2 !=0) {
            oddCount++;
        }if (number3 % 2 !=0) {
            oddCount++;
        }
        System.out.println(oddCount);
        System.out.println("======== Task 2 ========");
        //===== Task 2 ======

        System.out.println("Enter the number of the day of the week");
        int dayOfWeek = scanner.nextInt();
        String dayNameUA = "";
        String dayNameEN = "";
        switch (dayOfWeek){
            case 1:
                dayNameUA = "Понеділок";
                dayNameEN = "Monday";
                break;
            case 2:
                dayNameUA = "Вівторок";
                dayNameEN = "Tuesday";
                break;
            case 3:
                dayNameUA = "Середа";
                dayNameEN = "wednesday";
                break;
            case 4:
                dayNameUA = "Четвер";
                dayNameEN = "Thursday";
                break;
            case 5:
                dayNameUA = "Пятниця";
                dayNameEN = "Friday";
                break;
            case 6:
                dayNameUA = "Субота";
                dayNameEN = "Saturday";
                break;
            case 7:
                dayNameUA = "Неділя";
                dayNameEN = "Sunday";
                break;

        }
        System.out.println("Dat in EN" + dayNameEN);
        System.out.println("Dat in UA" + dayNameUA);

        System.out.println("======== Task 3 ========");
        // ===== Task 3 =====
        System.out.println("Enter name of the country");
        String countryName = scanner.next();
        Continent continent = Continent.EUROPE;//default
        switch (countryName){
            case "Katar":
            case "Korea":
            case "China":
            case "Japan":
                continent = Continent.ASIA;
                break;
            case "Ukraine":
            case "France":
            case "Germany":
            case "Poland":
                continent = Continent.EUROPE;
                break;
            case "Egypt":
            case "Nigeria":
            case "South Africa":
                continent = Continent.AFRICA;
                break;
            case "Canada":
            case "Usa":
            case "Mexico":
                continent = Continent.NORTH_AMERICA;
                break;
            case "Australia":
                continent = Continent.AUSTRALIA;
                break;
            case "Antarctica":
                continent = Continent.ANTARCTICA;
                break;
        }
        System.out.println("Continent" + continent);
        System.out.println("======== Task 4 ========");
        //======== Task 4 ========

        class Product {
            String name;
            double price;
            int quantity;

            public Product(String name, double price, int quantity) {
                this.name = name;
                this.price = price;
                this.quantity = quantity;
            }}

            Product product1 = new Product("Apple", 1.5, 70);
            Product product2 = new Product("Banana", 2.4, 30);
            Product product3 = new Product("Melon", 4.7, 50);
            Product product4 = new Product("Orange", 2.0, 20);
            //The most expensive product
            Product mostExpensive = product1;
            if (product2.price > mostExpensive.price){
                mostExpensive = product2;
            }
            if (product3.price > mostExpensive.price){
            mostExpensive = product3;
            }if (product4.price > mostExpensive.price){
            mostExpensive = product4;
             }
        System.out.println("The most expensive product :"+ mostExpensive.name);
        System.out.println("The most expensive product quantity :"+ mostExpensive.quantity);

        Product maxQuantity = product1;
        if (product2.quantity > maxQuantity.quantity){
            maxQuantity = product2;
        }if (product3.quantity > maxQuantity.quantity){
            maxQuantity = product3;
        }if (product4.quantity > maxQuantity.quantity){
            maxQuantity = product4;
        }
        System.out.println("the max quentity product " + maxQuantity.name);




        }
    }


