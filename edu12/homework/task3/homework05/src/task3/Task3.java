package task3;

public class Task3 {
    private static int positionSecond;
    private static int min;
    private static int positionMin;
    private static int product;
    static boolean positive;


    public static void positionOfSecond(int[] arr) {
        positionSecond = -1;
        positive = false;
        for (int e = 0; e < arr.length; e++) {
            if (arr[e] > 0 && !positive) {
                positive = true;
            } else if (arr[e] > 0 && positive) {
                positionSecond = e + 1;
                break;
            }
        }
    }

    public static void positionOfMin(int[] arr) {
        min = arr[0];
        positionMin = 0;
        int e = 0;
        while (e < arr.length) {
            if (arr[e] < min) {
                min = arr[e];
                positionMin = e;
            }
            e++;
        }
    }

    public static void productOfAll(int[] arr) {
        product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                product = product * arr[i];
            }
        }
    }

    public static void printResult() {
        System.out.println("Second positive number is  on position " + positionSecond);
        System.out.println("Min number is " + min + ", it in position " + positionMin);
        System.out.println("Product = " + product);
    }

}
