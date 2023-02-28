public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Student student1 = new Student(new FullName("Andriy", "Combo"), 22, 3);
        Student student2 = new Student(new FullName("Alina", "Dumbl"), 21, 2);
        System.out.println(student1.info());
        System.out.println(student1.active());
        System.out.println(student2.info());
        System.out.println(student2.active());
        try {
            Student clonStudent = (Student) student1.clone();
            clonStudent.setCourse(4);
            System.out.println(clonStudent.info());
        }
        catch (CloneNotSupportedException a) {
            a.printStackTrace();
        }
        System.out.println(student1.info());
        System.out.println(student2.info());
    }
}