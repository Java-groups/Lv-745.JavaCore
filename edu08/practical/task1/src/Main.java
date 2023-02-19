public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();
    }

    static void run() throws CloneNotSupportedException {
        Department department = new Department("Main", new Department.Address("Lviv", "Holovna", 5));
        System.out.println("Original department: " + department);
        Department clonDepartment = (Department)department.clone();
        System.out.println("Clone of department: " + clonDepartment);
        Department.Address clonAdress = new Department.Address("Chernivtsi", "Vokzalna", 2);
        clonDepartment.setAddress(clonAdress);
        System.out.println("Clone of department and changed address: " + clonDepartment);
    }
}