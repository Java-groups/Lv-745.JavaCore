package homework2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {}
    abstract void fly();
    abstract void land();
}
