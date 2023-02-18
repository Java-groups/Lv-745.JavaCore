public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIDMember;

    private int fixedMonthlyPayment;

    public ContractEmployee() {
    }

    public ContractEmployee(String name, String employeeId, String federalTaxIDMember, int fixedMonthlyPayment) {
        this.setName(name);
        this.setEmployeeId(employeeId);
        this.federalTaxIDMember = federalTaxIDMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.setSalary(calculatePay());
    }


    public String getFederalTaxIDMember() {
        return federalTaxIDMember;
    }

    public void setFederalTaxIDMember(String federalTaxIDMember) {
        this.federalTaxIDMember = federalTaxIDMember;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" + "name: " + this.getName() + '\'' +
                "employee ID: " + this.getEmployeeId() + '\'' +
                ", federal Tax ID Member: " + federalTaxIDMember + '\'' +
                ", salary: " + this.getSalary() +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return (int) getSalary();
    }
}
