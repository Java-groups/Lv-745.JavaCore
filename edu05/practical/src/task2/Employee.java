package task2;

public class Employee {
    private String name;

    private int departmentNumber;

    private int salary;

    Employee() {};
    Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

public static void searchInDepar(int num, Employee arr[]) {
    for (int k = 0; k < arr.length; k++) {
        if (num == arr[k].departmentNumber) {
            System.out.println("Employers of this departament: " + arr[k].name);
        }
    }
}
    public static void arrangeWorkers(Employee arr[]) {
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].salary < arr[j].salary) {
                    tmp = arr[i].salary;
                    arr[i].salary = arr[j].salary;
                    arr[j].salary = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name + " " + arr[i].salary);
        }
    }
}
