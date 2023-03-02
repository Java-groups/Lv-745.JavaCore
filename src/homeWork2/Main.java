package homeWork2;

public class Main {
    public static void main(String[] args) {
         Employeer roman = new Employeer("Roman",23,500.00);
        Developer Volodymyr = new Developer("Volodymyr", 33,700.00,"Java developer");
        Developer Stepan = new Developer("Stepan", 18,400.00,"Java developer");
        System.out.println(roman.report());
        System.out.println(Volodymyr.report());
        System.out.println(Stepan.report());
    }
}
