package homeWork7.practicalTask;

public class Main  {

        public static void main(String[] args) throws CloneNotSupportedException {
            Department department = new Department("Head Quarter",new Department.Address("Kyiv","Volodymyrska",23));
            System.out.println(" -----Initial Department-------- ");
            System.out.println(department);
            Department cloneDepartment = (Department)department.clone();
            System.out.println(" -----Clone Department without address changing--------");
            System.out.println(cloneDepartment);
            Department.Address cloneDepAddress =new Department.Address("Lviv","Volodymyrska",23);
            cloneDepartment.setAddress(cloneDepAddress);
            System.out.println(" -----Clone Department with changed address--------");
            System.out.println(cloneDepartment);
            System.out.println(" -----Initial Department-------- ");
            System.out.println(department);
        }
    }