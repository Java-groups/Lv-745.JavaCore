import java.io.IOException;

public class Main {


	public static void main(String[] args) throws IOException {
		// create 5 students
        Student st1 = new Student("Volodymyr", "Barvinok");
        Student st2 = new Student("Alex", "Posanskiy");
        Student st3 = new Student("Stasy", "Flores");
        Student st4 = new Student();
        Student st5 = new Student();
        
        st1.setBirthYear(1988);	
        st1.output();
        
        st2.setBirthYear(1995);
        st2.output();
        
        st3.setBirthYear(2001);	
        st3.output();
        
        st4.input();
        st4.output();
        
        st5.output();
        
        System.out.println();

        
        
        



		
	}
	



}
