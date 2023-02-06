package AutoPractical_1;

public class Truck extends Car{

    private final int maxTowing;

    public Truck(String model, int maxSpeed, int yearOfManufacture, int maxTowing) {
        super(model, maxSpeed, yearOfManufacture);
        this.maxTowing = maxTowing;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Truck is running");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Truck has stopped");
    }

    @Override
    public String toString() {
        return super.toString() + ", maxTowing=" + maxTowing + '}';
    }
}
