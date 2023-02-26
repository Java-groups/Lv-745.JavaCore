package practical_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare collection myCollection of 10 integers and fill it

        System.out.print("Enter which size of massive u want to create: ");
        int size = sc.nextInt();
        ArrayList<Integer> myCollection = new ArrayList<>(size);
        myCollection.addAll(fillCollection(size));
        System.out.println(myCollection);

        // Find and save in list newCollection all positions of element more than 5 in the collection

        System.out.print("Enter the position from which u wanna save new massive: ");
        int position = sc.nextInt();
        System.out.println(newCollection(myCollection, position));

        // Remove from collection myCollection elements, which are greater then 20

        System.out.print("Elements, which are greater then 20 - removed | new massive: ");
        removeElements(myCollection);
        System.out.println(myCollection);

        // Insert elements 1, -3, -4 in positions 2, 8, 5

        System.out.println("massive with inserted elements: ");
        insertElements(myCollection, 2, 1);
        insertElements(myCollection, 8, -3);
        insertElements(myCollection, 5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - [ " + (i + 1) + "] value of element - [ " + myCollection.get(i) + " ]");
        }

        // Sort and print collection

        Collections.sort(myCollection);
        System.out.println("Sorted Collection: " + myCollection);

    }


    // filling a massive with random numbers
    private static List<Integer> fillCollection(int size) {
        ArrayList<Integer> filledCollection = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            filledCollection.add(randomInt());
        }
        return filledCollection;
    }

    // Creating a newCollection from Integer position --> myCollection.size()
    private static List<Integer> newCollection(List<Integer> myCollection, Integer position) {
        if (position <= myCollection.size()) {
            ArrayList<Integer> newCollection = new ArrayList<>();
            for (int i = position; i < myCollection.size(); i++) {
                newCollection.add(myCollection.get(i));
            }
            return newCollection;
        } else {
            System.out.println("sorry, but collection consist only of " + myCollection.size() + " integers");
            return Collections.singletonList(0);
        }

    }

    // removing the elements , which are > 20
    private static void removeElements(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) >= 20) {
                myCollection.remove(i);
            }
        }
    }

    // inserting the elements, which position are declared in task
    private static void insertElements(List<Integer> myCollection, int insertPos, int insertVal) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (i == insertPos) {
                myCollection.set(i, insertVal);
            }
        }
    }


    // function to fill something randomly
    private static int randomInt() {
        return ThreadLocalRandom.current().nextInt(-50, 50 + 1);
    }

}
