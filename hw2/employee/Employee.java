package employee;

public class Employee {
    private String name;
    private double rate;
    private int hours;

    private static double totalSalary = 0;

    public Employee (String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSalary+=rate*hours;
    }

    public Employee (){

    }

    public static double getTotalSalary() {
        return totalSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public double getSalary(){
        return this.rate*this.hours;
    }

    public double getBonuses(){
        return this.rate*this.hours*0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
