package com.softserve.edu06.hwtask1;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIDmember;
    private double rate;
    private int hours;

    public String getFederalTaxIDmember() {
        return federalTaxIDmember;
    }

    public void setFederalTaxIDmember(String federalTaxIDmember) {
        this.federalTaxIDmember = federalTaxIDmember;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public ContractEmployee (){}
    public ContractEmployee (String name, String employeeID, String federalTaxIDmember, double rate, int hours){
        setName(name);
        setEmployeeID(employeeID);
        setFederalTaxIDmember(federalTaxIDmember);
        setRate(rate);
        setHours(hours);
        setMonthlyWage(calculatePayment());
    }
    @Override
    public double calculatePayment() {
        return rate * hours;
    }

}
