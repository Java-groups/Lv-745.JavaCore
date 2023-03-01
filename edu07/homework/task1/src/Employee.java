import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    public static class BySalary implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getMonthSalary() - e2.getMonthSalary());
        }
    }
    private String name;
    private String employeeId;

    private double monthSalary;

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(Employee workers ) {
        return (int) (monthSalary - workers.getMonthSalary());
    }
}

