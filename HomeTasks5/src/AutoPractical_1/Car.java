package AutoPractical_1;

public abstract class Car {
    private final String model;
    private final int maxSpeed;
    private final int yearOfManufacture;
    protected boolean isRunning;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void run() {
            isRunning = true;
        }

    public void stop() {
        isRunning = false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture ;
    }
}
