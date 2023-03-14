package com.softserve.edu06.hwtask1;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private double fixedPayment;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedPayment() {
        return fixedPayment;
    }

    public void setFixedPayment(double fixedPayment) {
        this.fixedPayment = fixedPayment;
    }
    public SalariedEmployee (){}
    public SalariedEmployee (String name,String employeeID,String socialSecurityNumber, double fixedPayment){
        setName(name);
        setEmployeeID(employeeID);
        setSocialSecurityNumber(socialSecurityNumber);
        setFixedPayment(fixedPayment);
        setMonthlyWage(calculatePayment());
    }
    @Override
    public double calculatePayment() {
        return fixedPayment;
    }

}
