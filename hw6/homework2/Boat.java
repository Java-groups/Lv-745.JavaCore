package homework2;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat(){}

    public Boat(int volume,int passengers) {
        this.volume = volume;
        this.setPassengers(passengers);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("Boat is sailing. Volume: "+this.volume+"; Passengers: "+this.getPassengers());
    }
}
