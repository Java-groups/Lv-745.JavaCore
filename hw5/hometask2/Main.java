package hometask2;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John",32,34000.32);
        Developer mike = new Developer("Mike",34, 45000.15, "Junior developer" );
        System.out.println(john.report());
        System.out.println(mike.report());
    }
}
