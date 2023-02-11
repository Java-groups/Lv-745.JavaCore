package task1;

public class Array {
    private int number;

    public Array() {
    }

    public Array(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void findMax(Array arr[]) {
        int imax = 0;
        int max = arr[imax].getNumber();
        int i = 0;
        while (i < arr.length) {
            if (arr[i].getNumber() > max) {
                imax = i;
                max = arr[imax].getNumber();
            }
            i++;
        }
        System.out.println("Maximum = " + max);
    }

    public static void sumOfPositive(Array arr[]) {
        int sumPositive = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].getNumber() > 0) {
                sumPositive = sumPositive + arr[j].getNumber();
            }
        }
        System.out.println("The sum of positive numbers is = " + sumPositive);
    }
    public static void moreValues(Array arr[]) {
        int amountOfNegative = 0;
        int amountOfPositive = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k].getNumber() < 0) {
                amountOfNegative = amountOfNegative + 1;
            }
            if (arr[k].getNumber() > 0) {
                amountOfPositive = amountOfPositive + 1;
            }
        }
        if (amountOfPositive > amountOfNegative) {
            System.out.println("The values of positive numbers is more");
        } else {
            System.out.println("The values of negative numbers is more");
        }
        System.out.println("The amount of negative numbers is = " + amountOfNegative);
        System.out.println("The amount of positive numbers is = " + amountOfPositive);
    }
}
