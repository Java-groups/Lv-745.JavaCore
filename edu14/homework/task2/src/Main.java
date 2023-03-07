import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
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
        Map<String, Long> nameCounts = employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        if (nameCounts.isEmpty()) {
            return Optional.empty();
        }
        return nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
