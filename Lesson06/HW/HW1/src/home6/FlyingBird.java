package home6;

public class FlyingBird extends Bird {
    private int speedFly;

    FlyingBird(String feathers, String layEggs, int speedFly) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.speedFly = speedFly;
        System.out.println("Пір'я - " + feathers + ", яйця - " + layEggs + ", швидкість польоту - " + speedFly);
    }

    @Override
    public void fly() {

    }
}
