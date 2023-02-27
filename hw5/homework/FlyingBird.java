package hw5.homework;

public class FlyingBird extends Bird{

    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.print("I can fly!  ");
    }


}
