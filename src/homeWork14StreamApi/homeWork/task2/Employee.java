package homeWork14StreamApi.homeWork.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;


    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCount = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);

    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("ROMAN"),
                new Employee("STIV"),
                new Employee("SEM"),
                new Employee("NICK"),
                new Employee("JACK"),
                new Employee("NICK")
        );


        Optional<String> mostPopularName = mostPopularName(employees.stream());
        if (mostPopularName.isPresent()){
            System.out.println("most popular name is :" + mostPopularName);
        }else {
            System.out.println("there is no most popular name");
        }
    }
}
