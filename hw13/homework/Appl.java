import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Appl {
    public static void main(String[] args) {
        System.out.println("--------FIRST TASK. ----------");
        taskOne();
        System.out.println("--------SECOND TASK. ----------");
        taskTwo();
    }

    public static void taskOne(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", "Phone", LocalDate.of(2021, 12, 10), 3600));
        products.add(new Product("Samsung", "Phone", LocalDate.of(2021, 11, 2), 2000));
        products.add(new Product("Xiaomi", "Phone", LocalDate.of(2020, 10, 15), 3300));
        products.add(new Product("Apple", "Tablet", LocalDate.of(2021, 9, 20), 1000));
        products.add(new Product("Samsung", "Tablet", LocalDate.of(2020, 8, 3), 1500));
        products.add(new Product("Xiaomi", "Tablet", LocalDate.of(2021, 7, 5), 2000));
        products.add(new Product("Apple", "Laptop", LocalDate.of(2020, 6, 10), 3000));
        products.add(new Product("Samsung", "Laptop", LocalDate.of(2020, 5, 1), 2500));
        products.add(new Product("Xiaomi", "Laptop", LocalDate.of(2021, 4, 7), 3500));
        products.add(new Product("Apple", "Headphone", LocalDate.of(2021, 3, 15), 500));
        products.add(new Product("Samsung", "Headphone", LocalDate.of(2020, 2, 17), 800));
        products.add(new Product("Xiaomi", "Headphone", LocalDate.of(2020, 1, 23), 1000));
        products.add(new Product("Apple", "Smartwatch", LocalDate.of(2021, 12, 10), 700));
        products.add(new Product("Samsung", "Smartwatch", LocalDate.of(2020, 11, 2), 1000));
        products.add(new Product("Xiaomi", "Smartwatch", LocalDate.of(2020, 10, 15), 1500));
        products.add(new Product("Apple", "Speaker", LocalDate.of(2021, 9, 20), 200));
        products.add(new Product("Samsung", "Speaker", LocalDate.of(2020, 8, 3), 300));
        products.add(new Product("Xiaomi", "Speaker", LocalDate.of(2021, 7, 5), 400));
        products.add(new Product("Apple", "TV", LocalDate.of(2020, 6, 10), 1000));
        products.add(new Product("Samsung", "TV", LocalDate.of(2020, 5, 1), 1500));
        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getCategory().equals("Phone") && p.getPrice() > 3000
                        && p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
        filteredProducts.forEach(System.out::println);
    }
    public static void taskTwo(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Din"));
        employees.add(new Employee("Sam"));
        employees.add(new Employee("Sam"));
        Optional<String> mostPopularName = mostPopularName(employees.stream());
        if (mostPopularName.isPresent()) {
            System.out.println("Most popular name: " + mostPopularName.get());
        } else {
            System.out.println("No employees found.");
        }
    }
    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> counts = employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println(counts);
        Optional<Map.Entry<String, Long>> maxEntry = counts.entrySet().stream().max(Map.Entry.comparingByValue());
        return maxEntry.map(Map.Entry::getKey);
    }
}
