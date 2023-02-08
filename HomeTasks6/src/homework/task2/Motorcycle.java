package homework.task2;

public class Motorcycle extends GroundVehicle{

    private int maxSpeed;

    public Motorcycle(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
