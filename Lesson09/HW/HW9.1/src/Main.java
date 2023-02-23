import java.util.*;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            System.out.println("Введіть число" + (i + 1) + ":");
            int element = scanner.nextInt();
            myCollection.add(element);
        }

        System.out.println(myCollection);


        // Find the index of the maximum and minimum elements
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) > myCollection.get(maxIndex)) {
                maxIndex = i;
            }
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }

        }
        System.out.println("Max: " + myCollection.get(maxIndex));
        System.out.println("Min: " + myCollection.get(minIndex));

//
//
// Swap the maximum and minimum elements
        int temp = myCollection.get(maxIndex);
        myCollection.set(maxIndex, myCollection.get(minIndex));
        myCollection.set(minIndex, temp);



        System.out.println(myCollection);

        // Insert a random three-digit number before the first negative element
        Random random = new Random();
        int num = random.nextInt(900) + 100;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, num);
                break;
            }
        }
        System.out.println(myCollection);

        // Insert a zero between all neighboring elements with different signs
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int a = myCollection.get(i);
            int b = myCollection.get(i + 1);
            if (a * b < 0) {
                myCollection.add(i + 1, 0);
            }
        }
        System.out.println(myCollection);

        // Copy the first k elements to list1 and the rest to list2 in reverse order
        int k = 5;
        ArrayList<Integer> list1 = new ArrayList<>(k);
        ArrayList<Integer> list2 = new ArrayList<>(myCollection.size() - k);
        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }

        System.out.println(list1);
        System.out.println(list2);

        // Remove the last even element (if there is one)
        int lastIndex = myCollection.size() - 1;
        while (lastIndex >= 0 && myCollection.get(lastIndex) % 2 != 0) {
            lastIndex--;
        }
        if (lastIndex >= 0) {
            myCollection.remove(lastIndex);
        } else {
            System.out.println("There is no even element to remove.");
        }

        System.out.println(myCollection);

        // Remove the element following the first minimum
        int min = myCollection.get(0);
        int removeIndex = -1;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                removeIndex = i + 1;
            }
        }
        if (removeIndex != -1 && removeIndex < myCollection.size()) {
            myCollection.remove(removeIndex);
        }
        System.out.println(myCollection);



    }
}

