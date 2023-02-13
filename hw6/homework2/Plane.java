package homework2;

public class Plane extends FlyingVehicle{
    private int maxDistance;
    public Plane() {}
    public Plane(int maxDistance, int passengers) {
        this.maxDistance = maxDistance;
        this.setPassengers(passengers);
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("Plane is flying. Max distance: "+this.maxDistance+"; Passengers: "+this.getPassengers());
    }

    @Override
    void land() {
        System.out.println("Plane is landing");
    }
}
