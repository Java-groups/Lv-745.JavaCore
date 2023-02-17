package practical_task;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // creating an instance for one department and initialize it //

        Department department = new Department("OAK HEART", new Department.Address("Lviv", "Shakespeare", 23));
        System.out.println("Initialized Department #1: " + department);

        // Creating one more department by cloning previous

        Department copyOfDepartment = (Department) department.clone();
        System.out.println("Cloned: " + copyOfDepartment + "\n");

        // Changing city for cloned department

        Department.Address cloneDepCity = new Department.Address("Kiev", "Shakespeare",23);
        System.out.println("Initialized Department #1: " + department);
        System.out.println("Cloned with changed Address: " +cloneDepCity + "\n");


    }

    @Override
    public Main clone() {
        try {
            return (Main) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }
}
