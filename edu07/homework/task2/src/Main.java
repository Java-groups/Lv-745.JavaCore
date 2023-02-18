public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        waterTransport();
        flyingTransport();
        groundTransport();
    }

    public static void waterTransport() {
        WaterVehicle waterVehicles[] = {new Liner(1200, 4), new Boat(4, 15)};
        for (WaterVehicle waterVehicle : waterVehicles) {
            waterVehicle.isSailing();
        }
    }

    public static void flyingTransport() {
        FlyingVehicle flyingVehicles[] = {new Plane(350, 5000), new Helicopter(4, 500, 1000)};
        for (FlyingVehicle flyingVehicle : flyingVehicles) {
            flyingVehicle.fly();
            flyingVehicle.land();
        }
    }

    public static void groundTransport() {
        GroundVehicle groundVehicles[] = {new Bus(50, "Chernivtci - Lviv"), new Motorcycle(1, 250), new Car(4, "Volvo")};
        for(GroundVehicle groundVehicle : groundVehicles ) {
            groundVehicle.drive();
        }
    }
}