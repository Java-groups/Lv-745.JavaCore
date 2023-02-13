package homework1;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private double fixedSalary;
    public SalariedEmployee (){}
    public SalariedEmployee (String employeeld,String name,String socialSecurityNumber, double fixedSalary){
        this.setEmployeeld(employeeld);
        this.setName(name);
        this.socialSecurityNumber=socialSecurityNumber;
        this.fixedSalary = fixedSalary;
        this.setMonthlySalary(calculatePay());
    }
    @Override
    public double calculatePay() {
        return fixedSalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double monthSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employee ID='" + this.getEmployeeld() + '\'' +
                "name='" + this.getName() + '\'' +
                ", monthSalary=" + this.getMonthlySalary() +
                '}';
    }
}
