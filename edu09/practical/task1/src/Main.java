import java.util.*;

public class Main {
    private static List<Integer> myCollection = new ArrayList<>();
    private static List<Integer> newCollection = new ArrayList<>();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("Randomly generated collection: ");
        myCollection.addAll(createMyCollection());
        System.out.println(myCollection);
        System.out.println("Indexes of elements, which are greater then 5: ");
        newCollection.addAll(createNewCollection(myCollection));
        System.out.println(newCollection);
        System.out.println("Remove elements, which are greater then 20: ");
        myCollection.removeIf(i->i>20);
        System.out.println(myCollection);
        System.out.println("Insert elements 1, -3, -4 in positions 2, 8, 5: ");
        myCollection.add(2, Integer.valueOf("1"));
        myCollection.add(5, Integer.valueOf("-4"));
        myCollection.add(8, Integer.valueOf("-3"));
        printResult();
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }

    public static List<Integer> createMyCollection() {
        Random random = new Random();
        List<Integer> myRandomCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myRandomCollection.add(random.nextInt(30 - 10) + 1);
        }
        return myRandomCollection;
    }

    private static List<Integer> createNewCollection(List<Integer> myCollection) {
        List<Integer> myNewCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                myNewCollection.add(i);
            }
        }
        return myNewCollection;
    }

    private static void printResult() {
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position: " + i + ", value: " + myCollection.get(i));
        }
    }


}