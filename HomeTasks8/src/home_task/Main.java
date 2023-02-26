package home_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of massive: ");
        int size = sc.nextInt();
        ArrayList<Integer> myCollection = new ArrayList<>(size);

        // Declare collection myCollection of 10 integers and fill it

        fillCollection(myCollection, size);
        System.out.println("Filled collection: " + myCollection);

        // Swap the maximum and minimum elements in the list

        swapMaxMin(myCollection);
        System.out.println("Swap max/min: " + myCollection);

        // Insert a random three-digit number before the first negative element of the list

        insertBeforeNegative(myCollection);
        System.out.println("Inserted three digit: " + myCollection);

        // Insert a zero between all neighboring elements collection myCollection with different sign

        insertZero(myCollection);
        System.out.println("Inserted zero: " + myCollection);

        // Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order

        System.out.print("Enter the number of first elements, u want to copy: ");
        int k = sc.nextInt();
        copyLists(myCollection, k);

        // In a list myCollection remove the last even element

        removeEven(myCollection);
        System.out.println("Without last even: " + myCollection);

        // Remove from the list myCollection the element following the first minimum

        firstMinimum(myCollection);
        System.out.println("Without first minimum: " + myCollection);

    }

    private static void fillCollection(ArrayList<Integer> myCollection, int size) {
        for (int i = 0; i < size; i++) {
            myCollection.add(randomInt());
        }
    }

    private static void swapMaxMin(ArrayList<Integer> myCollection) {

        // using Collection.(max/min) and indexOf to find the value and position of max/min
        int max = Collections.max(myCollection);
        int indexMax = myCollection.indexOf(max);

        int min = Collections.min(myCollection);
        int indexMin = myCollection.indexOf(min);

        // using Collection.set to swap the max/min
        myCollection.set(indexMax, min);
        myCollection.set(indexMin, max);
    }

    private static void insertBeforeNegative(ArrayList<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add((i), randomThreeDigitInt());
                break;
            }
        }
    }

    private static void insertZero(ArrayList<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
            }
        }
    }

    private static void copyLists(ArrayList<Integer> myCollection, int k) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }
        for (; k < myCollection.size(); k++) {
            list2.add(myCollection.get(k));
        }
        Collections.reverse(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }

    private static void removeEven(ArrayList<Integer> myCollection) {
        for (int i = myCollection.size() - 1; i > 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                return;
            }
        }
        System.out.println("There is no even element");
    }

    private static void firstMinimum(ArrayList<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) < myCollection.get(0) && i != myCollection.size() - 1) {
                myCollection.remove(i);
                return;
            }
        }
    }

    private static int randomInt() {
        return ThreadLocalRandom.current().nextInt(-50, 50 + 1);
    }

    private static int randomThreeDigitInt() {
        return ThreadLocalRandom.current().nextInt(100, 998 + 1);
    }


}
