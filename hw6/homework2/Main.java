package homework2;

public class Main {
    public static void main(String[] args) {
        runAll();
    }
    public static void runAll(){
        waterFleet();
        flyingFleet();
        groundFleet();
    }
    public static void waterFleet(){
        System.out.println("---------Water fleet------------");
        WaterVehicle [] waterVehicles = {new Liner(3,1500),new Boat(15,24)};
        for (WaterVehicle waterVehicle:waterVehicles) {
            waterVehicle.isSailing();
        }
    }

    public static void flyingFleet(){
        System.out.println("---------Flying fleet------------");
        FlyingVehicle [] flyingVehicles = {new Plane(4400,523), new Helicopter(12000,22000,35)};
        for (FlyingVehicle flyingVehicle: flyingVehicles) {
            flyingVehicle.fly();
            flyingVehicle.land();
        }
    }

    public static void groundFleet(){
        System.out.println("---------Ground fleet------------");
        GroundVehicle [] groundVehicles = {new Bus("132",74), new Motorcycle(250,1),new Car("Nissan X-Trail",4)};
        for (GroundVehicle groundVehicle:groundVehicles) {
            groundVehicle.drive();
        }
    }

}
