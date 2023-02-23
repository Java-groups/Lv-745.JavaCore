package pt1;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть десять цілих чисел: ");
//        Integer myList = scanner.nextInt();
        //System.out.println(myList);

        //myCollection.addAll(myList);
        Random rand = new Random();
        //int i = rand.nextInt();
        for (int i = 0; i < 10; i++) {
            int element = rand.nextInt(100);
            myCollection.add(element);
            System.out.println(rand.nextInt());

        }

        System.out.println("Original collection: " + myCollection);


        // Find and save in list newCollection all positions of element more than 5 in the collection.

        List<Integer> newCollection = new ArrayList<>();

        for(int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }

        System.out.println("New Collection: " + newCollection);

        myCollection.removeIf(element -> element > 20);
        System.out.println(myCollection);


// Не працює код, що нижче????
//        myCollection.add(2, 1);
//        myCollection.add(7, -3);
//        myCollection.add(4, -4);
//        for(int i = 0; i < myCollection.size(); i++) {
//            System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
//        }


        Collections.sort(myCollection);

        System.out.println(myCollection);

//



    }
}
