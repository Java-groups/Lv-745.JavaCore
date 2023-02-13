package homework1;

public class Employee implements Comparable<Employee>{
    private String name;
    private String employeeld;
    private double monthlySalary;
    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getMonthlySalary()<o.getMonthlySalary()){
            return 1;
        } else if (this.getMonthlySalary()==o.getMonthlySalary()){
            return 0;
        } else {
            return -1;
        }
    }
}
