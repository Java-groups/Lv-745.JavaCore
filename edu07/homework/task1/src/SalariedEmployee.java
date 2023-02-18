public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;

    private int workHours;

    private double hourlyRate;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, int workHours, double hourlyRate) {
        this.setName(name);
        this.setEmployeeId(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
        this.setSalary(calculatePay());
    }


    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return workHours * hourlyRate;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" + "name: " + this.getName() + '\'' +
                "employee ID: " + this.getEmployeeId() + '\'' +
                ", social security number: " + socialSecurityNumber + '\'' +
                ", salary: " + this.getSalary() +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return (int) getSalary();
    }
}
