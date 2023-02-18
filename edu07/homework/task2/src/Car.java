public class Car extends GroundVehicle{
    private String model;

    public Car() {
    }

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("The model of car is " + this.model + ". Passengers - " + this.getPassengers() + ".");
    }
}
