package array4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        String[][] cars;
        cars = new String[4][3];
        cars[0][0] = "Truck";
        cars[0][1] = "2000";
        cars[0][2] = "200";
        cars[1][0] = "Sedan";
        cars[1][1] = "2022";
        cars[1][2] = "150";
        cars[2][0] = "Pickup";
        cars[2][1] = "2010";
        cars[2][2] = "180";
        cars[3][0] = "Bike";
        cars[3][1] = "2015";
        cars[3][2] = "300";
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < cars.length; i++){
            for(int j = 0; j < cars[i].length; j++) {
                System.out.println("Введіть рік: ");
                String [i][j] = scanner.nextLine();
                System.out.println("Тип авто - " + cars[i][j]);  // НЕ ДОРОБИЛА ЩЕ
            }
               // Collections.sort(cars);
        };
        //System.out.println(cars[1][2]);
    }
}
    /*    Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < monthDays.length; i++){
        System.out.println("Введіть число: ");
        int value = scanner.nextInt();
        System.out.println("Кількість днів у місяці - " + monthDays[value]);
        }
     */