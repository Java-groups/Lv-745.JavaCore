package practical1;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    int run() {
        return 5;
    }

    @Override
    int stop() {
        return -10;
    }
}
