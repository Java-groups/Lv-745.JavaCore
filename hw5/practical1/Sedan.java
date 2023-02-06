package practical1;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    int run() {
        return 10;
    }

    @Override
    int stop() {
        return -15;
    }
}
