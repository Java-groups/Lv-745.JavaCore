public class Main {
    public static void main(String[] args) {
        Truck ford = new Truck("Ford F-450", 150, 2020);
        Truck chevrolet = new Truck("Silverado", 180, 2023);
        Sedan volkswagen = new Sedan("Golf IV", 120, 2021);
        Sedan chrysler = new Sedan("300C", 140, 2022);

        Car cars[] = new Car[4];
        cars[0] = volkswagen;
        cars[1] = ford;
        cars[2] = chrysler;
        cars[3] = chevrolet;

        for (Car car:cars) {
            System.out.println("Info about car: " + car);
        }

    }
}