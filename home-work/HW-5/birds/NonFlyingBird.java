package birds;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Bird Can`t fly | " + (isLayEggs() ? "Bird Lay Eggs" : "Bird Are Not Lay Eggs"));
    }


}