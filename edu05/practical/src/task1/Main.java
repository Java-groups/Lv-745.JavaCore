package task1;

public class Main {
    public static void main(String[] args) {
        Array arr[] = new Array[5];
        arr[0] = new Array(1);
        arr[1] = new Array(2);
        arr[2] = new Array(5);
        arr[3] = new Array(-4);
        arr[4] = new Array(-2);

        Array.findMax(arr);
        Array.sumOfPositive(arr);
        Array.moreValues(arr);

    }
}