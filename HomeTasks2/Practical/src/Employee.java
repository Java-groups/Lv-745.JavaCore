import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    private String name;
    private double rate;
    private double hours;
    public static double totalSum;
    double sum = 0;
    double bonus = 0;
    public static int count = 0;


    // Constructors with and without parameters
    public Employee() {
        totalSum = totalSum + rate*hours;
        count++;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + rate*hours;
        count++;
    }


    // Getters and setters

    public String setName() {
        this.name = sc.nextLine();
        return name;
    }

    public double setRate() {
        this.rate = sc.nextDouble();
        return rate;
    }

    public double setHours() {
        this.hours = sc.nextDouble();
        return hours;
    }

    public double getSalary() {
        sum = rate * hours;
        return sum;
    }

    public double getBonus() {
        bonus = 0.1 * getSalary();
        return bonus;
    }

    // Override toString

    @Override
    public String toString() {
        return "Employee [name = " + name + ", rate = " + rate + ", hours = " + hours + "]";
    }

    // method of returning totalSum
    public double getTotalSum() {
        this.totalSum = totalSum;
        return totalSum;
    }


}
