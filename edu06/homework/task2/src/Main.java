public class Main {
    public static void main(String[] args) {
        Employee olga = new Employee("Olga", 25, 33250.85);
        Developer dmytro = new Developer("Dmytro", 31, 45000.21, "Senior");
        System.out.println(olga.report());
        System.out.println(dmytro.report());
    }
}