import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert month number");
        Month monthOfBirth = new Month(Integer.parseInt(br.readLine()));
        System.out.println( monthOfBirth.output());

        int positive = 0;
        int negative = 0;

        int[] array = {2, 3, 4, 1, 3, -5, -6, -7, -3, -5};

        for(int i = 0; i <= (array.length / 2 - 1); i++) {
            if(array[i] >= 0) {
                positive = positive + array[i];
            } else System.out.println("This range has negative integer");
        }

        for(int i = 5; i < 10; i++) {
            if(array[i] < 0) {
                negative = negative + array[i];
            } else System.out.println("This range has positive integer");
        }

        System.out.println("Sum of the first 5 numbers - " + positive);
        System.out.println("Sum of the second 5 numbers - " + negative);


        IntegerSorting sort = new IntegerSorting(1,-2,3,5,6);
        sort.solutionEven();
        sort.solutionMin();

        ArrayList <Car> cars = new ArrayList<Car>();

        System.out.println("Insert the Year of production Škoda");
        cars.add(new Car("Škoda", "Fabia", 1.0, Integer.parseInt(br.readLine())));
        System.out.println("Insert the Year of production Toyota");
        cars.add(new Car("Toyota", "Corolla", 2.0, Integer.parseInt(br.readLine())));
        System.out.println("Insert the Year of production Volvo");
        cars.add(new Car("Volvo", "XC", 2.0, Integer.parseInt(br.readLine())));
        System.out.println("Insert the Year of production Jaguar");
        cars.add(new Car("Jaguar", "XF", 5.0, Integer.parseInt(br.readLine())));

        List<Car> sortedCars = cars.stream().sorted(Comparator.comparing(Car::getYearOfProduction).reversed()).toList();

        for(Car car : sortedCars) {
            System.out.println(car.getYearOfProduction());
        }
    }

}
