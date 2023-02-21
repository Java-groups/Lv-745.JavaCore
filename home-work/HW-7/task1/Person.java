package task1;

public abstract class Person {
	
	private FullName fullName;
	public FullName getFullName() {
		
		return fullName;
		
	}

	public void setFullName(FullName fullName) {
		
		this.fullName = fullName;
		
	}

	private int age;
	
	public abstract String activity();
	
	public Person(FullName fullName, int age) {
		
		super();
		this.fullName = fullName;
		this.age = age;
		
	}
	
	public String info() {
		
		return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + this.age;
		
	}
	

}
