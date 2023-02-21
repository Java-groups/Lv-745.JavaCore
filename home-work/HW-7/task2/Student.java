package task2;
import task1.*;

public class Student extends Person{
	
	private int course;
	
	public Student(FullName fullName, int age, int course) {
		
		super(fullName, age);
		this.course = course;
		
	}
	
	@Override
	public String info() {
		
		return info() + ", Course: " + course;
		
	}
	
	@Override
	public String activity() {
		
		return "I study at university";
		
	}

}
