package practical1;

public class Main {
    public static void main(String[] args) {
        /*Create array cars use Car[] cars = new Car{new Truck ... , new Sedan etc...}*/
        Car[] cars = {new Truck("Ford F-150", 180, 2021),new Truck("RAM 1500", 180, 2022),
                new Sedan("Honda Accord", 210, 2023),new Sedan("Volkswagen Passat", 210, 2020)};
        for (Car car:cars) {
            System.out.println(car);
        }
    }
}
