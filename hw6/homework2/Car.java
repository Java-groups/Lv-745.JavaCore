package homework2;

public class Car extends GroundVehicle{
    private String model;
    public Car() {}

    public Car(String model,int passengers) {
        this.model = model;
        this.setPassengers(passengers);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    void drive() {
        System.out.println("Car is driving. Car model: "+this.model+"; Passengers: "+this.getPassengers());
    }

}
