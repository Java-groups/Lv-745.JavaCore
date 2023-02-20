import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static List<Integer> myCollection = new ArrayList<>();
    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("Declare collection myCollection of 10 integers: ");
        myCollection.addAll(createMyCollection());
        System.out.println(myCollection);
        System.out.println("Swap the maximum and minimum elements in the list: ");
        swapMinMax();
        System.out.println("Insert a random three-digit number before the first negative element of the list: ");
        firstNegElement();
        System.out.println(myCollection);
        System.out.println("Insert a zero between all neighboring elements collection: ");
        zeroInCollection();
        System.out.println("Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the \n" +
                "list2 in reverse order: ");
        copyElements();
        System.out.println("In a list myCollection remove the last even element (if there are even elements in the list). If \n" +
                "there is no such element, display a message");
        removeLastElement();
        System.out.println("Remove from the list myCollection the element following the first minimum. If the minimum \n" +
                "element is the last one, nothing needs to be removed");
        removeElemAfterMin();

    }

    public static List<Integer> createMyCollection() {
        List<Integer> myRandomCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myRandomCollection.add(randomInt(-50, 50));
        }
        return myRandomCollection;
    }

    private static int randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private static void swapMinMax() {
        Integer minValue = Collections.min(myCollection);
        Integer maxValue = Collections.max(myCollection);
        int minIndex = myCollection.indexOf(minValue);
        int maxIndex = myCollection.indexOf(maxValue);
        myCollection.set(maxIndex, minValue);
        myCollection.set(minIndex, maxValue);
        System.out.println("Min value: " + minValue + ", max value: " + maxValue);
    }

    private static void firstNegElement() {
        int indexOfNegative = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                indexOfNegative = i;
                break;
            }
        }
        if (indexOfNegative != -1) {
            int randNum = (int) (Math.random() * 900 + 100);
            myCollection.add(indexOfNegative, randNum);
        }
    }

    private static void zeroInCollection() {
        List<Integer> modifCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size() - 1; i++) {
            modifCollection.add(myCollection.get(i));
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                modifCollection.add(0);
            }
        }
        System.out.println(modifCollection);
    }
    private static void copyElements() {
        int k = 5;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }
    private static void removeLastElement() {
        int lastEvenIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }

        if (lastEvenIndex != -1) {
            myCollection.remove(lastEvenIndex);
            System.out.println("Removed the last even element. Updated list: " + myCollection);
        } else {
            System.out.println("No even elements found in the list.");
        }
    }
    private static void removeElemAfterMin() {
        int minIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }
        }

        if (minIndex < myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
            System.out.println("Removed the element following the first minimum. Updated list: " + myCollection);
        } else {
            System.out.println("The minimum element is the last one. Nothing to remove.");
        }
    }
}