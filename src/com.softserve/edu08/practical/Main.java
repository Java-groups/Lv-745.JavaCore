package com.softserve.edu08.practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

        public class Main {
            public static void main(String[] args) {

                System.out.println(
                        """
                        PRACTICAL TASK
                        1)Declare collection myCollection of 10 integers and fill it (from the console or random).
                        2)Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
                        3)Remove from collection myCollection elements, which are greater then 20. Print result
                        4)Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
                        5)Sort and print collection
                        Use one or more of the next: List, ArrayList, LinkedList""");

                List < Integer > myCollection = new ArrayList < > ();
                List < Integer > newCollection = new ArrayList < > ();

                System.out.println("1)Randomly generated myCollection of 10 integers: ");
                for (int i = 0; i < 10; i++) {
                    myCollection.add(ThreadLocalRandom.current().nextInt(-10, 20 + 1));
                }
                System.out.println(myCollection);

                System.out.println("\n2)newCollection with indexes of myCollection elements>5");
                for (int i = 0; i < myCollection.size(); i++) {
                    if (myCollection.get(i) > 5) {
                        newCollection.add(i);
                    }
                }
                System.out.println(newCollection);

                System.out.println("\n3)myCollection without elements>20");
                myCollection.removeIf(
                        new Predicate<Integer>() {
                            @Override
                            public boolean test(Integer integer) {
                                return integer > 20;
                            }
                        }
                );
                System.out.println(myCollection);


                System.out.println("\n4)Inserted to myCollection at positions 2, 8, 5 elements 1, -3, -4 and output the result:");
                myCollection.set(2, 1);
                myCollection.set(8, -3);
                myCollection.set(5, -4);
                for (int i = 0; i < myCollection.size(); i++) {
                    System.out.println("position – " + i + " value of element – " + myCollection.get(i));
                }

                System.out.println("\n5)myCollection: " + myCollection);
                Collections.sort(myCollection);
                System.out.println("Sorted myCollection: " + myCollection);

            }
        }