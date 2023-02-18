public class Boat extends WaterVehicle{
    private int volume;

    public Boat() {}
    public Boat(int volume) {
        this.volume = volume;
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("Yhe boat is sailing. There are " + this.getPassengers() + " passengers, volume - " + this.volume + "m.cub.");
    }


}
