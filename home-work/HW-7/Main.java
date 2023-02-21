import task1.FullName;
import task2.Student;

public class Main {
	
	public static void main(String[] args) {
		Student dmytroStudent = new Student(new FullName("Dmytro", "Zaharchuk"), 21, 3);
		Student petroStudent = new Student(new FullName("Petro", "Miroschnychenko"), 23, 5);
		
		System.out.println(dmytroStudent.info() + " " + dmytroStudent.activity());
		System.out.println(petroStudent.info() + " " + petroStudent.activity());
		
	}

}
