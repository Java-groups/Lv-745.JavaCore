package homework;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student jonnyDepp = new Student(20,new FullName("Jonny","Depp"),3);
        Student tomCruise = new Student(21,new FullName("Tom", "Cruise"),4);
        System.out.println(tomCruise.info());
        System.out.println(tomCruise.active());
        System.out.println(jonnyDepp.info());
        System.out.println(jonnyDepp.active());
        Student cloneStudent = (Student)tomCruise.clone();
        cloneStudent.setCourse(5);
        System.out.println(cloneStudent.info());
        System.out.println(tomCruise.info());
        System.out.println(jonnyDepp.info());
    }
}
