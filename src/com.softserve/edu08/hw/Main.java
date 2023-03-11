package com.softserve.edu08.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[ ] args) {

        System.out.println(
                """
                HOMEWORK TASK
                1)Declare collection myCollection of 10 integers and fill it (from the console or random).
                2)Swap the maximum and minimum elements in the list.
                3)Insert a random three-digit number before the first negative element of the list
                4)Insert a zero between all neighboring elements collection myCollection with different signs
                5)Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the list2 in reverse order.
                6)In a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message.
                7)Remove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed.
                Use one or more of the next: List, ArrayList, LinkedList
                """);


        List<Integer> myCollection = new ArrayList<>();
        List<Integer> list1;
        List<Integer> list2;

        System.out.println("\n1)Randomly filled myCollection with 10 integers: ");
        for (int i = 0; i < 10; i++) {
            myCollection.add(ThreadLocalRandom.current().nextInt(-20, 20 + 1));
        }
        System.out.println(myCollection);


        System.out.println("\n2)Swapped maximal and minimal elements in myCollection: ");
        int maximalNumber = Collections.max(myCollection);
        int maximalNumberIndex = myCollection.indexOf(maximalNumber);
        int minimalNumber = Collections.min(myCollection);
        int minimalNumberIndex = myCollection.indexOf(minimalNumber);
        myCollection.set(maximalNumberIndex,minimalNumber);
        myCollection.set(minimalNumberIndex,maximalNumber);
        System.out.println("minimal number: "+ minimalNumber + " <--> maximal number: " + maximalNumber + "\nmyCollection: " + myCollection);


        System.out.println("\n3)Inserted random 3digit-number before the first negative element of myCollection: ");
        boolean flag = true;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0){
                myCollection.add(i, ThreadLocalRandom.current().nextInt(100, 999 + 1));
                flag = false;
                break;
            }
        }
        if (flag) {System.out.println("No negative numbers");}
        System.out.println(myCollection);


        System.out.println("\n4)Inserted zero between all neighboring elements with different signs of myCollection: ");
        for (int i = 1; i < myCollection.size(); i++) {
            if ((myCollection.get(i) * myCollection.get(i-1)) < 0){
                myCollection.add(i, 0);
            }
        }
        System.out.println(myCollection);

        int amountKElements = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        System.out.println("\n5)Copied first "+ amountKElements + "-elements to list1, in direct order, the rest to list2 in reverse order: ");
        list1 = myCollection.subList(0,amountKElements);
        list2 = myCollection.subList(amountKElements,myCollection.size());
        Collections.reverse(list2);
        System.out.println("myCollection: " + myCollection + "\nlist1: "+ list1 + "\nlist2: " + list2);


        System.out.println("\n6)Removed the last even element in myCollection: ");
        System.out.println(myCollection);
        //reused flag variable from 2nd-task
        flag=true;
        for (int i = myCollection.size()-1; i >=0; i--) {
            if ( (myCollection.get(i) % 2 == 0) && (myCollection.get(i)!=0) ){
                myCollection.remove(i);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("No even numbers");
        }
        System.out.println(myCollection);


        minimalNumberIndex = myCollection.indexOf(Collections.min(myCollection));
        System.out.println("\n7)Removed the element after the first minimal: " + myCollection.get(minimalNumberIndex));
        System.out.println(myCollection);
        //reused minimalNumberIndex variable from 2nd-task
        if ( minimalNumberIndex != myCollection.size()){
            myCollection.remove(minimalNumberIndex+1);
        } else{
            System.out.println("Oops! Minimal number has last index");
        }
        System.out.println(myCollection);

    }
}
