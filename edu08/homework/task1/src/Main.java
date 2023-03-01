public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        run();
    }

    public static void run() {
        Student students[] = new Student[2];
        students[0] = new Student(new FullName("Andriy", "Combo"), 22, 3);
        students[1] = new Student(new FullName("Alina", "Dumbl"), 21, 2);
        for (Student student : students) {
            System.out.println(student.info());
            System.out.println(student.active());
        }
        try {
            Student clonStudent = (Student) students[0].clone();
            clonStudent.setCourse(4);
            System.out.println(clonStudent.info());
        } catch (CloneNotSupportedException a) {
            a.printStackTrace();
        }
        for (Student student : students) {
            System.out.println(student.info());
            System.out.println(student.active());
        }
    }
}