package AutoPractical_1;

public class Sedan extends Car{

    private final int maxPassengers;

    public Sedan(String model, int maxSpeed, int yearOfManufacture, int passangers) {
        super(model, maxSpeed, yearOfManufacture);
        this.maxPassengers = passangers;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Sedan is running");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Sedan has stopped");
    }

    @Override
    public String toString() {
        return super.toString() + ", maxPassengers=" + maxPassengers + '}';
    }
}
