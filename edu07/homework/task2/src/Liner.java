public class Liner extends WaterVehicle{
    private int floors;

    public Liner() {}
    public Liner(int floors) {
        this.floors = floors;
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    void isSailing() {
        System.out.println("The liner is sailing. There are - " + this.getPassengers() + " passengers and " + this.floors + " floors.");
    }
}
