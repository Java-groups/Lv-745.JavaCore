package homework1;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIdmember;
    private double hourCost;
    private int hoursWorked;
    public ContractEmployee (){}
    public ContractEmployee (String employeeld,String name,String federalTaxIdmember, double hourCost, int hoursWorked){
        this.setEmployeeld(employeeld);
        this.setName(name);
        this.federalTaxIdmember=federalTaxIdmember;
        this.hourCost = hourCost;
        this.hoursWorked = hoursWorked;
        this.setMonthlySalary(calculatePay());
    }
    @Override
    public double calculatePay() {
        return hourCost*hoursWorked;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getHourCost() {
        return hourCost;
    }

    public void setHourCost(double hourCost) {
        this.hourCost = hourCost;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
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
