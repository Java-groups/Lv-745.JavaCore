package BirdHomework_1.CanFly;

import BirdHomework_1.Bird;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
