package employee;

public class EmplApp {
    public static void main(String[] args) {
        Employee emplIra = new Employee("Ira", 5.5,43);
        Employee empPasha = new Employee("Pasha", 3.1, 34);
        Employee empVasya = new Employee("Vasya", 4.4, 40);
        System.out.println("Ira's salary:    " + emplIra.getSalary());
        System.out.println("Print Employee:  " + empPasha);
        System.out.println("Vasya's Bonuses: " + empVasya.getBonuses());
        System.out.println("Total Salary:    " + Employee.getTotalSalary());

    }
}
