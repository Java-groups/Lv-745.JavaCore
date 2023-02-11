public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, Boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can't fly.");
    }
}
