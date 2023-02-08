package HW4;

public class Employee {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Введите количество департаментов: " );
//        int size = sc.nextInt();
//        int[] department_number = new int[size];
//
//        String [] name= {"Olga", "Pavlo", "Lera", "Marina", "Leonid"};
//         Integer[] salary = {3500, 2300,5000,1250,4320};
//        System.out.println("Insert department number:");
//
//        for (int i = 0; i < size; i++) {
//            department_number[i] = sc.nextInt();
//        }
//
//        Arrays.sort(salary, Collections.reverseOrder());
//        for (int values : salary){
//            System.out.println(values + '\n');
//        }

     private String name;
     private int salary;
     private int department_number;


    public Employee(String name, int salary, int department_number) {
        this.name = name;
        this.salary = salary;
        this.department_number = department_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }
}



