package birds;

public class FlyingBird extends Bird{
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird Can Fly | " + (isLayEggs() ? "Bird Lay Eggs" : "Bird Are Not Lay Eggs"));
    }
}