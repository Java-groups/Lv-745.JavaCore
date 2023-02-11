package employee;

public class Developer extends Employee{

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age %d, Salary: \u20B4 %.2f.", getName(), getAge(), getSalary());
    }
}