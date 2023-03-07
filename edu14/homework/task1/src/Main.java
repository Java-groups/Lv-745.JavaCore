import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone 14 Pro", "Phone", LocalDate.of(2023, 02, 15), 55000));
        products.add(new Product("iPhone 14", "Phone", LocalDate.of(2023, 01, 12), 52000));
        products.add(new Product("iPhone 13", "Phone", LocalDate.of(2021, 12, 05), 49000));
        products.add(new Product("iPhone SE", "Phone", LocalDate.of(2021, 12, 10), 42000));
        products.add(new Product("AirPods", "Headphone", LocalDate.of(2022, 10, 25), 24000));
        products.add(new Product("Watch Ultra", "Watch", LocalDate.of(2021, 12, 5), 35000));
        products.add(new Product("Apple Watch Series 8", "Watch", LocalDate.of(2021, 9, 30), 30000));
        products.add(new Product("Apple Watch SE", "Watch", LocalDate.of(2021, 7, 13), 28000));
        products.add(new Product("Apple Watch Nike", "Watch", LocalDate.of(2021, 6, 8), 26000));
        products.add(new Product("Ipad Pro", "Tablet", LocalDate.of(2023, 1, 30), 60000));
        products.add(new Product("Ipad Air", "Tablet", LocalDate.of(2022, 4, 29), 45000));
        products.add(new Product("Ipad mini", "Tablet",LocalDate.of(2023, 1, 30), 60000));
        products.add(new Product("Xiaomi M11", "Phone", LocalDate.of(2022, 8, 15), 15000));
        products.add(new Product("Xiaomi Mi8", "Phone", LocalDate.of(2020, 4, 8), 5000));
        products.add(new Product("Xiaomi Mi6", "Phone", LocalDate.of(2019, 3, 24), 3500));
        products.add(new Product("Xiaomi Lite", "Phone", LocalDate.of(2022, 2, 12), 10000));
        products.add(new Product("Xiaomi 5X", "Phone", LocalDate.of(2020, 11, 18), 4000));
        products.add(new Product("Xiaomi", "Headphone", LocalDate.of(2022, 10, 1), 2000));
        products.add(new Product("Samsung", "Headphone", LocalDate.of(2022, 2, 12), 5000));
        products.add(new Product("Samsung Galaxy", "Phone", LocalDate.of(2022, 3, 2), 12000));
        List<Product> sortPhones = products.stream()
                .filter(p -> p.getCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
        sortPhones.forEach(System.out::println);
        System.out.println();
    }
}