package homeWork9Coolections.Part1;

import java.util.*;

public class MyCollectionManipulations {
    public static void main(String[] args) {

        ArrayList<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(100));
        }
        System.out.println("Original collection: " + myCollection);

        // Swap the maximum and minimum elements
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            } else if (myCollection.get(i) > myCollection.get(maxIndex)) {
                maxIndex = i;
            }
        }
        int temp = myCollection.get(minIndex);
        myCollection.set(minIndex, myCollection.get(maxIndex));
        myCollection.set(maxIndex, temp);
        System.out.println("Collection after swapping min and max elements: " + myCollection);

        // Insert a random three-digit number before the first negative element
        int randomThreeDigitNumber = rand.nextInt(900) + 100;
        int negIndex = myCollection.size();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                negIndex = i;
                break;
            }
        }
        myCollection.add(negIndex, randomThreeDigitNumber);
        System.out.println("Collection after inserting random three-digit number: " + myCollection);

        // Insert a zero between all neighboring elements with different signs
        for (int i = 1; i < myCollection.size(); i++) {
            int prev = myCollection.get(i - 1);
            int curr = myCollection.get(i);
            if ((prev < 0 && curr > 0) || (prev > 0 && curr < 0)) {
                myCollection.add(i, 0);
                i++;
            }
        }
        System.out.println("Collection after inserting zeros between elements with different signs: " + myCollection);

        // Copy elements to list1 and list2
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int k = 5;
        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        // Remove the last even element
        int lastEvenIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }
        if (lastEvenIndex != -1) {
            myCollection.remove(lastEvenIndex);
            System.out.println("Collection after removing last even element: " + myCollection);
        } else {
            System.out.println("No even element found in the collection");
        }

        // Remove the element following the first minimum
        int firstMinIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(firstMinIndex)) {

                if (firstMinIndex < myCollection.size() - 1) {
                    myCollection.remove(firstMinIndex + 1);
                    System.out.println("Collection after removing element following first minimum: " + myCollection);
                } else {
                    System.out.println("First minimum is the last element, nothing to remove");
                }
            }
        }
    }
}
