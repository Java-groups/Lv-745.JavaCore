public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee("NazzP",120.33,48.4);
        Employee emp3 = new Employee("Yura",88.5,30.1);

        // Entering info about 1st employee
        System.out.print("Enter the name of 1st employee");
        emp1.setName();
        System.out.print("Enter the rate of 1st employee");
        emp1.setRate();
        System.out.print("Enter the hours of 1st employee");
        emp1.setHours();

        // Calculate the salary for 2nd employee
        System.out.println("Salary for 2nd employee = " +emp2.getSalary());

        // Output info about 1st/2nd employee
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        // bonus info
        System.out.println("Bonuses for 2nd employee = " +emp2.getBonus());

        //Total salary
        System.out.println("Total salary = " +emp1.getTotalSum());
    }
}
