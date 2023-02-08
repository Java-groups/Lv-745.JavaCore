package HW4;

import HW4.Car.Car;

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
    public static void main(String[] args ) {

//1 Ask user to enter the number of month. Read the value and write the number of days in
//this month (create array with amount days of each month).

        Scanner sc = new Scanner(System.in);
        int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Введите номер мецяца чтоб узнать количество дней: ");
        int n = sc.nextInt();
        System.out.println("Количество дней в выбранном месяце - "+ (days[n-1]));

//2 Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or
//product of last 5 element in the other case.

        System.out.println(" Введите цифры в массив : " );
        int[] numbers = new int[10];

        for (int i = 0; i<numbers.length; i++){
            numbers[i]= sc.nextInt();
        }
        int amt = 5;
        int sum = 0;
        int product = 1;

        for (int i = 0; i < amt; i++) {
            if(numbers[i]>0){

            sum += numbers[i];
               }}

         for(int a = 5; a <10; a++){

            product = product * numbers[a];

            }
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);

 //3 Enter 5 integer numbers. Find
        //• position of second positive number;
        //• minimum and its position in the array.

      int array [] = {15,62,-34,82,12,-8,4,97,32,47};
      int max = 0;
      int min = 0;
      int indexMax = 0;
      int indexMin = 0;
      int prod =1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i-1];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {min = array[i];}
        }

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[indexMax])
            { indexMax = i-1;}
            else if (array[i] < array[indexMin])
            {indexMin = i;}
        }

        for (int i = 0; i < array.length; i++){
            if (array[i]%2==0) {prod = prod*array[i];}

        }

        System.out.println("Max number: "+max+'\n'+"Min number: "+min+'\n'+"Index Of Max: "+ indexMax+'\n'+ "Index Of Min: "+ indexMin+'\n'+ "Product: "+prod);
















        }
        }










