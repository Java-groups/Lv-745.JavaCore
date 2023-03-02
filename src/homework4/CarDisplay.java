package homework4;

import java.util.Scanner;

public class CarDisplay {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Car car1 = new Car();
        car1.type = "SUV";
        car1.year = 2019;
        car1.engineCapacity = 3.0f;

        Car car2 = new Car();
        car2.type = "SEDAN";
        car2.year = 2016;
        car2.engineCapacity = 2.0f;

        Car car3 = new Car();
        car3.type = "ROADSTER";
        car3.year = 2020;
        car3.engineCapacity = 1.6f;

        Car car4 = new Car();
        car4.type = "Pickup";
        car4.year = 2017;
        car4.engineCapacity = 3.5f;

        System.out.println("Enter model year");
        int modelYear = scanner.nextInt();
        switch (modelYear){
            case 2019 :
                System.out.println("За цим роком є даний автомобіль в кузові " + car1.type + " "+ car1.year+" року " + "і з об`ємом двигуна "+ car1.engineCapacity);
                break;
            case 2016 :
                System.out.println("За цим роком є даний автомобіль в кузові " + car2.type +" "+ car2.year+ " року " + "і з об`ємом двигуна " +car2.engineCapacity);
                break;
            case 2020 :
                System.out.println("За цим роком є даний автомобіль в кузові " + car3.type + " "+ car3.year+ " року " + "і з об`ємом двигуна "+ car3.engineCapacity);
                break;
            case 2017:
            System.out.println("За цим роком є даний автомобіль в кузові " + car4.type + " " + car4.year +" року "+ "і з об`ємом двигуна " + car4.engineCapacity);
            default:
                System.out.println("За даним роком автомобіль відсутній");
        }

        System.out.println();
    }
}
