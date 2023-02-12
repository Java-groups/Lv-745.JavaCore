package home6;

public class NonFlyingBird extends Bird {
    private int speedRun;

    NonFlyingBird(String feathers, String layEggs, int speedRun) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.speedRun = speedRun;
        System.out.println("Пір'я - " + feathers + ", яйця - " + layEggs + ", швидкість - " + speedRun);
    }

    @Override
    public void fly() {

    }
}
