package homework2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(){}

    public Helicopter(int weight, int maxHeight, int passengers) {
        this.weight = weight;
        this.maxHeight = maxHeight;
        this.setPassengers(passengers);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {
        System.out.println("Helicopter is flying. Current weight: " + this.weight+" Max height: " + this.maxHeight+"; Passengers: "+this.getPassengers());
    }

    @Override
    void land() {
        System.out.println("Helicopter is landing");
    }
}
