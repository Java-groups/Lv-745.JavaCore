package practical1;

public class Main {
    public static void main(String[] args) {
        Truck ford = new Truck("Ford F-150", 180, 2021);
        Truck ram = new Truck("RAM 1500", 180, 2022);
        Sedan honda = new Sedan("Honda Accord", 210, 2023);
        Sedan volkswagen = new Sedan("Volkswagen Passat", 210, 2020);
        /*Create array cars use Car[] cars = new Car{new Truck ... , new Sedan etc...}*/
        Car[] cars = new Car[4];
        cars[0] = ford;
        cars[1] = ram;
        cars[2] = honda;
        cars[3] = volkswagen;
        for (Car car:cars) {
            System.out.println(car);
        }
    }
}
