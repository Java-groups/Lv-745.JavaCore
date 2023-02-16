package task1;

public class ContractEmployee extends Employee implements Payment{
    //hourly paid worker

    private String federalTaxIdMember;
    private double hoursWorked;
    private double hourlyRate;

    public ContractEmployee(String name, String federalTaxIdMember, double hoursWorked, double hourlyRate) {
        super(name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.setSalary(calculatePay());
    }

    @Override
    public double calculatePay() {
        return Math.round(hourlyRate * hoursWorked);
    }

    public String toString() {
        return "ContractEmployee [ EmployeID = " + this.getEmployeeId() + " | Name = " + this.getName() + " | Salary = " + this.getSalary() + " ]";
    }
}
