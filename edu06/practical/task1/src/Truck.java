public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void stop() {
        super.stop();
    }


}
