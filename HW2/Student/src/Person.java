import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
    private String fName;
    private String sName;
    private int BirthYear;

    public static int count = 1;

    public void input () throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your First Name");
        String FirstName = br.readLine();
        System.out.println("Enter your Second Name");
        String SecondName = br.readLine();
        System.out.println("Enter your Birth Year");
        int year = Integer.parseInt(br.readLine());
        this.fName = FirstName;
        this.sName = SecondName;
        this.BirthYear = year;
    }

    public Person(){count++;}

    public Person(String fName, int BirthYear){
        this.fName = fName;
        this.BirthYear = BirthYear;
        count++;
    }
    int ID = Person.count;

    public void setBirthYear(int year) {
        this.BirthYear = year;
    }

    public void setSecondName(String secondName) {
        this.sName = secondName;
    }

    public void setFirstName(String firstName) {
        this.fName = firstName;
    }
    public int getAge(){
        return LocalDate.now().getYear() - BirthYear;
    }
    public void print(){
        System.out.println("Student ID --- " + ID);
        System.out.println("First Name --- " + this.fName);
        System.out.println("Last Name --- " + this.sName);
        System.out.println("Age --- " + getAge());
    }
}