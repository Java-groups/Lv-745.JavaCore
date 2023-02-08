package HW4.Car;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.stream.*;
import java.util.*;
import java.util.List;
import java.util.Collections;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Car> cars = new ArrayList<Car>();
        System.out.println("Введите год выпуска Opel: ");
        cars.add(new Car("Opel",Integer.parseInt(sc.readLine()),1200));

        System.out.println("Введите год выпуска Mazda: ");
        cars.add(new Car("Mazda",Integer.parseInt(sc.readLine()),2500));

        System.out.println("Введите год выпуска Mercedes: ");
        cars.add(new Car("Mercedes",Integer.parseInt(sc.readLine()),4000));

        System.out.println("Введите год выпуска Honda: ");
        cars.add(new Car("Honda",Integer.parseInt(sc.readLine()),1800));

        List<Car> sortedCars = cars.stream().sorted(Comparator.comparing(Car::getYear).reversed()).collect(Collectors.toList());

        for(Car car : sortedCars) {
            System.out.println(car.getYear()+" "+car.getType());
        }







    }



}
