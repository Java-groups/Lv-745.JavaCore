package BirdHomework_1.CanNotFly;

import BirdHomework_1.Bird;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly [ depressed... ]");
    }


}
