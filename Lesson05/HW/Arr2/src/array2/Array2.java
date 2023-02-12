package array2;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

          //Scanner x = new Scanner(System.in);
       // int min = -15;
       // int max = 15;
            int[] numbers = {10, -5, 4, 8, 2, 2, 7, 9, 3, 2};
            int j =0;
            int product = 1;
            int sum = 0;
            int[] numbers1 = new int[numbers.length/2];
            int[] numbers2 = new int[numbers.length/2];
            for(int i = 0; i < 5; i++) {
                //if (i < numbers.length / 2) {
                  // numbers1[i] = numbers[i];
               // numbers2[j] = numbers[i];
                    //System.out.println(numbers1[i]);
                 //else {numbers2[j++] = numbers[i];
                if (numbers[i] > 0) {sum += numbers[i];}
           // else {product *= numbers[i];}
            }
            for(int i = numbers.length - 1; i >= 5; i --) {
                product *= numbers[i];
            }
                System.out.println("Сума становить: " + sum);
                System.out.println("Добуток становить: " + product);

            }

       // System.out.println(numbers2[j]);

        }



