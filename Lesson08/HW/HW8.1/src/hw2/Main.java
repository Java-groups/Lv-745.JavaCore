package hw2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Veronika", "Rain"), 20, 101);
        Student student2 = new Student(new FullName("Maxim", "Rainbow"), 19, 102);

        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 = student1.clone();
        student3.course = 103;
        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println(student3.info());
    }
}
