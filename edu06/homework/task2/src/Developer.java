public class Developer extends Employee{
    private String positionOfEmployee;

    public String getPositionOfEmployee() {
        return positionOfEmployee;
    }
    public void setPositionOfEmployee(String positionOfEmployee) {
        this.positionOfEmployee = positionOfEmployee;
    }
    public Developer(String name, int age, double salary, String positionOfEmployee) {
        super(name, age, salary);
        this.positionOfEmployee = positionOfEmployee;
    }
    public String report (){
        return String.format("Name: %s, Age: %d, Position of employee: %s, Salary: \u20b4 %.2f.", this.getName(), this.getAge(), this.getPositionOfEmployee(), this.getSalary());
    }
}
