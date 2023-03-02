package homeWork8OOP_InterfacesPolymorfizm.homeWork.task1;
public class ContractEmployee extends Employee implements Payment {

    private final double fixedPayment;

    @Override
    public double calculatePay() {
        return fixedPayment;
    }

    @Override
    public String toString() {
        return super.toString() + " Wage -- " + calculatePay() + "}\n";
    }

    public ContractEmployee(String employeeld, String name, double fixedPayment, int federalTaxIdmember) {
        super(employeeld, name);
        this.fixedPayment = fixedPayment;
    }
}