package homework2;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner() {}

    public Liner(int floors, int passengers) {
        this.floors = floors;
        this.setPassengers(passengers);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    void isSailing() {
        System.out.println("Liner is sailing. Floors: "+ this.floors + "; Passengers: "+this.getPassengers());
    }

}
