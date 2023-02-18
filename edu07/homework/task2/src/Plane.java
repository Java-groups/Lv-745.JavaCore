public class Plane extends FlyingVehicle{
    private int maxDistance;
    public Plane() {}
    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("The plane is flying. Max distance: " + this.maxDistance + " km. There are " + this.getPassengers() + " passengers.");
    }

    @Override
    void land() {
        System.out.println("The plane is landing.");
    }


}
