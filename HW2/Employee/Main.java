package Employee;


public class Main {
    public static void main(String[] args) {


    Employee emp1 = new Employee("Nina",32,145);
    Employee emp2 = new Employee("Vera",54,134);
    Employee emp3 = new Employee("Petro",28,100);

    System.out.println();
        System.out.println("Total Salary: "+Employee.getTotalSum());
        System.out.println("Nina salary: "+emp1.getSalary()+" bonuses: "+ emp1.getBonuses());
        System.out.println("Vera salary: "+emp2.getSalary()+" bonuses: "+ emp2.getBonuses());
        System.out.println("Petro salary: "+emp3.getSalary()+" bonuses: "+ emp3.getBonuses());

}



}
