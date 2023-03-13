
import task1.FullName;
import task2.Student;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		FullName fullName1 = new FullName("Oleh", "Melnyk");
		Student student1 = new Student(fullName1, 20, 1);

		FullName fullName2 = new FullName("Inna", "Velyka");
		Student student2 = new Student(fullName2, 22, 2);

		System.out.println(student1.info());
		System.out.println(student1.activity());
		System.out.println(student2.info());
		System.out.println(student2.activity());

		Student student3 = (Student) student1.clone();
		student3.setCourse(3);

		System.out.println(student1.info());
		System.out.println(student2.info());
		System.out.println(student3.info());
	}
}