import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {};

    public Person(String firstName, String lastName){};

    public void input() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Input your first name, please");
        String firstName = br.readLine();
        this.firstName = firstName;
        System.out.println("Input your last name, please");
        String lastName = br.readLine();
        this.lastName = lastName;
        System.out.println("Input your year of birth (example: 2020)");
        int birthYear = Integer.parseInt(br.readLine());
        this.birthYear = birthYear;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void output() {
        System.out.println("Hello, your first name is " + firstName + ", your last name is " + lastName + ".You are " + getAge()+ " years old." );
    }
    public void changeName() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Input your first name for change");
        String fn = br.readLine();
        this.firstName = fn;
        System.out.println("Input your first name for change");
        String ln = br.readLine();
        this.lastName = ln;
        System.out.println("Hello, your first name is " + firstName + ", your last name is " + lastName + ".You are " + getAge()+ " years old." );
    }
}
