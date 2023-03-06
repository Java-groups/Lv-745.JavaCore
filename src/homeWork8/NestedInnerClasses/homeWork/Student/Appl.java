package homeWork8.NestedInnerClasses.homeWork.Student;

public class Appl {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student PetroSchur = new Student(20,new FullName("Petro","Schur"),3);
        Student VladMarmylad = new Student(21,new FullName("Vlad", "Marmylad"),4);
        System.out.println(VladMarmylad.info());
        System.out.println(VladMarmylad.active());
        System.out.println(PetroSchur.info());
        System.out.println(PetroSchur.active());
        Student cloneStudent = (Student)VladMarmylad.clone();
        cloneStudent.setCourse(5);
        System.out.println(cloneStudent.info());
        System.out.println(VladMarmylad.info());
        System.out.println(PetroSchur.info());
    }
}