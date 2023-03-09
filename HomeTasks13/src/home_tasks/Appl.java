package home_tasks;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Appl {
    public static void main(String[] args) {
        run();
    }

    private static void run() {


        System.out.println("Filtered list: " + filterList(createProductList()));

        if (mostPopularName(createEmployeeList().stream()).isPresent()) {
            System.out.println("mostPopularName: " + mostPopularName(createEmployeeList().stream()).get());
        } else {
            System.out.println("NO mostPopularName");
        }
    }

    private static List<Product> createProductList() {
        List<Product> products = new ArrayList<>(20);

        products.add(new Product("Phone", LocalDate.of(2022, 1, 1), 2000));
        products.add(new Product("Laptop", LocalDate.of(2021, 2, 3), 50000));
        products.add(new Product("SmartWatch", LocalDate.of(2019, 3, 5), 1200));
        products.add(new Product("Tablet", LocalDate.of(2019, 4, 7), 1800));
        products.add(new Product("HeadPhones", LocalDate.of(2023, 5, 9), 1200));
        products.add(new Product("HeadPhones", LocalDate.of(2021, 6, 11), 1200));
        products.add(new Product("Column", LocalDate.of(2022, 7, 13), 500));
        products.add(new Product("Column", LocalDate.of(2023, 8, 15), 500));
        products.add(new Product("Phone", LocalDate.of(20222, 9, 17), 23000));
        products.add(new Product("SmartWatch", LocalDate.of(2021, 10, 19), 9000));
        products.add(new Product("SmartWatch", LocalDate.of(2021, 11, 21), 2900));
        products.add(new Product("Phone", LocalDate.of(2020, 12, 23), 7300));
        products.add(new Product("Phone", LocalDate.of(2018, 11, 25), 18_500));
        products.add(new Product("Laptop", LocalDate.of(2023, 10, 27), 65_000));
        products.add(new Product("Laptop", LocalDate.of(2019, 9, 29), 30_000));
        products.add(new Product("HeadPhones", LocalDate.of(2020, 8, 30), 7000));
        products.add(new Product("HeadPhones", LocalDate.of(2023, 7, 28), 3000));
        products.add(new Product("Column", LocalDate.of(2022, 6, 26), 5000));
        products.add(new Product("Column", LocalDate.of(2022, 5, 24), 1300));
        products.add(new Product("Column", LocalDate.of(2023, 4, 22), 3000));

        return products;
    }

    private static List<Product> filterList(List<Product> products) {
        List<Product> filtered = products.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
        return filtered;
    }

    private static List<Employee> createEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Din"));
        employees.add(new Employee("Sam"));
        employees.add(new Employee("Sack"));
        return employees;
    }


    private static Optional<String> mostPopularName(Stream<Employee> employees) {

        Map<String, Long> employee = employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        Optional<Map.Entry<String, Long>> mostPopular = employee.entrySet().stream().max(Map.Entry.comparingByValue());

        return mostPopular.map(Map.Entry::getKey);
    }
}
