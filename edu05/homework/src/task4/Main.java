package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Car cars[] = new Car[4];
        cars[0] = new Car("BMW", 2020, 2.0);
        cars[1] = new Car("Toyota", 2021, 1.6);
        cars[2] = new Car("Volvo", 2019, 2.0);
        cars[3] = new Car("Pejo", 2020, 1.6);
        System.out.print("Enter the field year:");
        int enterYear = Integer.parseInt(br.readLine());
        Car.chooseByYear(cars, enterYear);
        Car.sortingByYear(cars);

    }
}
