package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                """
                Homework Task 2
                For given a stream with objects of Employee class, return the optional, containing the most popular name.
                If this stream is empty, Optional.empty should be returned. For example:
                empl1.name = “Bob”, empl2.name = “Din”,
                empl3.name = “Sam”, empl4.name = “Sam”
                “Sam” should be returned.
                """);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Din"));
        employees.add(new Employee("Sam"));
        employees.add(new Employee("Sam"));
        System.out.println("list of employeees:\n" + employees);

        Optional<String> mostPopularName = mostPopularName(employees.stream());
        if (mostPopularName.isPresent()) {
            System.out.println("\nThe most popular name: " + mostPopularName.get());
        } else {
            System.out.println("Optional.empty");
        }

    }
    private static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> employee = employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        Optional<Map.Entry<String, Long>> mostPopular = employee.entrySet().stream().max(Map.Entry.comparingByValue());
        return mostPopular.map(Map.Entry::getKey);
    }
}

