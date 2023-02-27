import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(999 - (-999) + 1) + (-999));
        }
        System.out.println("Original Collection: " + myCollection);

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println("Collection after swapping max and min: " + myCollection);

        int index = 0;
        while (index < myCollection.size() && myCollection.get(index) >= 0) {
            index++;
        }
        if (index < myCollection.size()) {
            int randomNum = random.nextInt(900) + 100;
            myCollection.add(index, randomNum);
            System.out.println("Collection after inserting random 3-digit number: " + myCollection);
        }

        for (int i = 0; i < myCollection.size() - 1; i++) {
            int current = myCollection.get(i);
            int next = myCollection.get(i+1);
            if (current * next < 0) {
                myCollection.add(i+1, 0);
                i++;
            }
        }
        System.out.println("Collection after inserting zeros: " + myCollection);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int k = 5;
        for (int i = 0; i < myCollection.size(); i++) {
            if (i < k) {
                list1.add(myCollection.get(i));
            } else {
                list2.add(0, myCollection.get(i));
            }
        }
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                System.out.println("Collection after removing last even element: " + myCollection);
                break;
            }
            if (i == 0) {
                System.out.println("There is no even element in the collection.");
            }
        }

        int min = Collections.min(myCollection);
        int minIndex2 = myCollection.indexOf(min);
        if (minIndex2 < myCollection.size() - 1) {
            myCollection.remove(minIndex2+1);
        }
        System.out.println("Collection after removing element following first minimum: " + myCollection);
    }
}
