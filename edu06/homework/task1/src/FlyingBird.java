public class FlyingBird extends Bird{

    public FlyingBird(String feathers, Boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can fly.");
    }
}
