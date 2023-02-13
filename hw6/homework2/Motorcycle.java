package homework2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;
    public Motorcycle(){}
    public Motorcycle(int maxSpeed,int passengers) {
        this.maxSpeed = maxSpeed;
        this.setPassengers(passengers);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("Motorcycle is driving. Max speed:" + this.maxSpeed+"; Passengers: "+this.getPassengers());
    }
}
