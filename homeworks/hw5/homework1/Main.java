package com.softserve.edu05.hwtask1;

public class Main {
    public static void main(String[] args) {

     System.out.println(
             """
                HW TASK 1
                Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly(). 
                Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.\s
                Create array Bird and add different birds to it.\s
                Call fly() method for all of it. Output the\s
                information about each type of created bird.                                                                                                                                                                                                                               
             """);

        Bird [] birds = new Bird[4];
        birds[0] = new Eagle(true,false);
        birds[1] = new Swallow(true,true);
        birds[2] = new Penguin(false,true);
        birds[3] = new Chicken(true,true);

        for (Bird bird : birds) {
            bird.fly();
            System.out.println(bird);
        }

    }
}
