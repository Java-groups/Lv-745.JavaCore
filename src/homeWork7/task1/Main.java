package homeWork7.task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
    Student Roman = new Student(23, new FullName("Roman","Svyshch"),5);
    Student Bogdan = new Student(23,new FullName("Bogdan "," Makar"),3);
    Student Pavlo = new Student(27,new FullName("Pavlo "," Mysnuk"),6);
        System.out.println(Roman.info());
        System.out.println(Roman.activity());
        System.out.println(Bogdan.info());
        System.out.println(Bogdan.activity());
        System.out.println(Pavlo.info());
        System.out.println(Pavlo.activity());
        Student cloneStudent = (Student) Bogdan.clone();
        cloneStudent.setCourse(4);
        System.out.println(cloneStudent.info());
        System.out.println(cloneStudent.activity());


    }
}