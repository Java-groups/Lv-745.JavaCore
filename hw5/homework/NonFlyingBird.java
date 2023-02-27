package hw5.homework;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.print("I can't fly!  ");
    }

}
