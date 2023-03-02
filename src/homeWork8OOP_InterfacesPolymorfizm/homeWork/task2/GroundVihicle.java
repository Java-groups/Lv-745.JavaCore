package homeWork8OOP_InterfacesPolymorfizm.homeWork.task2;

public abstract class GroundVihicle extends Passengers implements Vehicle {
    public GroundVihicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}
