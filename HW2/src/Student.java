import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Student {
	
	// Fields
	private String firstName;
	private String lastName;
	private int birthYear;
	
	
	
	// Getter sand Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	// Constructors
	public Student() {}
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;	
	}
	
	// Methods
	public int getAge() {
		return LocalDate.now().getYear() - birthYear;	
	}
	
	public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input first Name");
        String fName = br.readLine();
        System.out.println("Please, input last Name");
        String lName = br.readLine();
        System.out.println("Please, input birth Year");
        String year = br.readLine();
        
        this.firstName = fName;
        this.lastName = lName;
        this.birthYear = Integer.parseInt(year);
		
	}
	
	public void output() {
	    System.out.println("Student's first Name is " + this.firstName);
	    System.out.println("Student's last Name is " + this.lastName);
	    System.out.println("Student's age is - " + getAge() + " years");
		
	}
	
	public void changeName(String fn, String ln) {
		this.firstName = ln;
		this.lastName = fn;
	}
	


	}
	

	

