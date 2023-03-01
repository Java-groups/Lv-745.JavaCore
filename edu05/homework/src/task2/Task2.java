package task2;

public class Task2 {

    private static int sum;

    private static int product;

    static boolean positiveValue;

    public static void getSumFirst5(int[] array) {
        sum = 0;
        positiveValue = true;
        for (int q = 0; q < array.length / 2; q++) {
            if (array[q] >= 0) {
                sum += array[q];
            } if (array[q] < 0 ) positiveValue = false;
            break;
        }
    }
    public static void getProductLast5 (int[] array) {
        product = 1;
        for (int i = array.length / 2; i < array.length; i++) {
            product *= array[i];
        }
    }
    public static void printResult (int[] array) {

            if (positiveValue) {
                System.out.println("sum " + sum);

            } else {
                System.out.println("product " + product);
            }
        }

    }


