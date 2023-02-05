package array3;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*5)+1;
        }
        System.out.println(Arrays.toString(numbers));

        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {product *= numbers[i];
                System.out.println("Product: " + product);
            }
        }


        int imin = 0;
        int min = numbers[imin];
        System.out.println("Current min = " + min + "  position = " + (imin + 1));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("\t Review element arr[" + (i + 1) + "] = " + numbers[i]);
            if (numbers[i] < min) {
                imin = i;
                min = numbers[imin];
                System.out.println("New min = " + min + "  position = " + (imin + 1));
            }
        }
        System.out.print("Minimum = " + min);
        System.out.println(" is in " + (imin + 1) + " place");


    }
}
