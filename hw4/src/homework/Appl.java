package homework;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Appl {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("--------FIRST TASK----------");
        taskOne();
        System.out.println("\n\n--------SECOND TASK----------");
        taskTwo();
        System.out.println("\n\n--------THIRD TASK----------");
        taskTree();
        System.out.println("\n\n--------FOURTH TASK----------");
        taskFour();
    }

    public static void taskOne() throws IOException {
        int numberOfMonth;
        System.out.print("Enter number of the month:");
        numberOfMonth = parseInt(br.readLine());
        System.out.println("Days in "+ getNameOfMonth(numberOfMonth)+" is: " + getDaysInMonth(numberOfMonth));
    }

    public static int getDaysInMonth (int numberOfMonth){
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return monthDays[numberOfMonth-1];
    }

    public static String getNameOfMonth (int numberOfMonth){
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        return monthNames[numberOfMonth-1];
    }

    public static void taskTwo() throws IOException {
        int enteredInt [] = new int[10];
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer number "+i+":");
            enteredInt[i-1] = parseInt(br.readLine());
        }
        System.out.println(taskTwoResult(enteredInt));
    }

    public static String taskTwoResult (int [] enteredInt){
        int sum = 0, product = 1;
        boolean isPositive = true;
        for (int i = 0; i < enteredInt.length; i++) {
            if (i<5) {
                sum+=enteredInt[i];
                if (enteredInt[i]<0) isPositive = false;
            } else {
                product*=enteredInt[i];
            }
        }
        if (isPositive){
            return "Sum of first five elements: " + sum;
        } else {
            return "Product of last five elements: " + product;
        }
    }

    public static void taskTree() throws IOException {
        int enteredInt [] = new int[5];
        int secondPositive, minPosition [], product;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter integer number "+i+":");
            enteredInt[i-1] = parseInt(br.readLine());
        }
        secondPositive = secondPositiveInt(enteredInt);
        minPosition = minValuePosition(enteredInt);
        product = productOfEvens (enteredInt);
        if (secondPositive == -1){
            System.out.println("Second positive not found.");
        } else {
            System.out.println("Second positive position: " + secondPositive);
        }
        System.out.println("Min value is: "+minPosition[0]+". Position of min value: " + minPosition[1]);
        if (product == 1) {
            System.out.println("No even numbers were entered.");
        } else {
            System.out.println("Product of even values: " + product);
        }
    }

    public static int secondPositiveInt (int [] enteredInt){
        int secondPositive = -1;
        boolean positive = false;
        for (int i = 0; i < enteredInt.length; i++) {
            if (enteredInt[i]>=0 && !positive){
                positive = true;
            } else if (enteredInt[i]>0 && positive){
                secondPositive = i+1;
                break;
            }
        }
        return secondPositive;
    }

    public static int [] minValuePosition(int [] enteredInt){
        int minValue = Integer.MAX_VALUE, minPosition = -1;
        for (int i = 0; i < enteredInt.length; i++) {
            if (enteredInt[i]<minValue) {
                minValue = enteredInt[i];
                minPosition = i+1;
            }
        }
        int [] result ={minValue,minPosition};
        return result;
    }

    public static int productOfEvens (int [] enteredInt){
        int product = 1;
        for (int i = 0; i < enteredInt.length; i++) {
            if (enteredInt[i] % 2 == 0 && enteredInt[i] != 0) {
                product*=enteredInt[i];
            }
        }
        return product;
    }


    public static void taskFour() throws IOException {
        Car[] cars = new Car[4];
        cars[0] = new Car("Wagon", 2020,2.0);
        cars[1] = new Car("Hatchback", 2018,1.0);
        cars[2] = new Car("Sedan", 2018,1.6);
        cars[3] = new Car("SUV", 2022,2.5);
        Car[] orderedCars;
        System.out.print("Enter the field year:");
        int enteredYear = parseInt(br.readLine());
        int totalCarsInYear = carsByYears (cars,enteredYear);
        System.out.print("Total cars in "+enteredYear+": "+totalCarsInYear);
        orderedCars = orderCars(cars);
        System.out.println("\nCars list ordered by year");
        for (Car orderedCar : orderedCars) {
            System.out.println(orderedCar);
        }
    }

    public static int carsByYears (Car [] cars, int enteredYear){
        int count = 0;
        for (Car car : cars) {
            if (car.getYear() == enteredYear) {
                count+=1;
                System.out.println(car);
            }
        }
        return count;
    }

    public static Car [] orderCars (Car [] cars){
        Car tempCar;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() > cars[j].getYear()) {
                    tempCar = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tempCar;
                }
            }
        }
        return cars;
    }

}
