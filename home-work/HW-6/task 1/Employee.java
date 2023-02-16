package task1;
import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee implements Comparable<Employee>{
    private AtomicInteger employeeId = new AtomicInteger(0);
    private static final DecimalFormat df = new DecimalFormat("0.00");

    private String name;

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = Double.parseDouble(df.format(salary));
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AtomicInteger getEmployeeId() {
        return employeeId;
    }


    @Override
    public int compareTo(Employee o) {
        if (this.getSalary()<o.getSalary()){
            return 1;
        } else if (this.getSalary()==o.getSalary()){
            return 0;
        } else {
            return -1;
        }
    }
}
