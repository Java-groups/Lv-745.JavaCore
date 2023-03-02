package homeWork8OOP_InterfacesPolymorfizm.myCollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
   static List<Integer> myCollection = new LinkedList<>();
   static List<Integer> newCollection = new LinkedList<>();



    public static void main(String[] args) {
        System.out.println("first task ");
        myCollection.addAll(fillCollection());
        System.out.println(myCollection);
        System.out.println("second task");
        // task 3 remove element which greather than 20.
        System.out.println("task 3 ---------");
        myCollection.removeIf(x -> x.intValue() > 20);
        System.out.println(myCollection);

        // task 4 insert element 1,-3,-4
        System.out.println("task 4 -------");
        myCollection.set(2,1);
        myCollection.set(8,-3);
        myCollection.set(5,-4);
        System.out.println(myCollection);

        //task 5 sort
        System.out.println("task 5 -----");
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
        // task 1 add 10 random numbers.
    private static List<Integer> fillCollection(){
        List<Integer> myLocalCollection = new LinkedList<>();
        for (int i = 0; i < 10;i++){

            myLocalCollection.add(randomInt(1,20));
        }
        return myLocalCollection;
    }
    private static Integer randomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max+2);
    }



    }


