public class Main {
    public static void main(String[] args) {
        WaterVehicle waterVehicles[] = {new Liner(1200, 4), new Boat(4, 15)};
        FlyingVehicle flyingVehicles[] = {new Plane(350, 5000), new Helicopter(4, 500, 1000)};
        GroundVehicle groundVehicles[] = {new Bus(50, "Chernivtci - Lviv"), new Motorcycle(1, 250), new Car(4, "Volvo")};
        waterTransport(waterVehicles);
        flyingTransport(flyingVehicles);
        groundTransport(groundVehicles);

    }

    public static void waterTransport(WaterVehicle waterVehicles[]) {
        for (WaterVehicle waterVehicle : waterVehicles) {
            waterVehicle.isSailing();
        }
    }

    public static void flyingTransport(FlyingVehicle flyingVehicles[]) {
        for (FlyingVehicle flyingVehicle : flyingVehicles) {
            flyingVehicle.fly();
            flyingVehicle.land();
        }
    }

    public static void groundTransport(GroundVehicle groundVehicles[]) {
        for(GroundVehicle groundVehicle : groundVehicles ) {
            groundVehicle.drive();
        }
    }
}