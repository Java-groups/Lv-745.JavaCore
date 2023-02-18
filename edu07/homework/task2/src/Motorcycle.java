public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle() {}

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("The max speed of motorcycle " + this.maxSpeed + " km/hour. Passengers - " + this.getPassengers() + ".");
    }

}
