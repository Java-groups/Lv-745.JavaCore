
public class Main  {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println(
                """
                PRACTICAL TASK
                Create class Department which contains field name of String type and field address of Address type
                In class Department create inner class Address with city and street fields of String type and building of type int
                In main method create an instance for one department and initialize it.
                Create one more department by cloning previous created department, change city for this object
                Print information about all departments
                """);

        Department department = new Department("Alpha",new Department.Address("Lviv","Independent Street",41));
        System.out.println("Alpha Department: " + department);

        Department deepCloneDepartment = (Department)department.clone();
        System.out.println("\nDeep Clone Alpha Department: " + deepCloneDepartment);

        Department.Address tempAddress = new Department.Address("Ivano-Frankivsk","Halitska Street",10);
        deepCloneDepartment.setAddress(tempAddress);

        System.out.println("\nChanged Address of Deep Clone Alpha Department: " + deepCloneDepartment);
        System.out.println("\nOriginal Alpha Department: " + department);

 }
}
