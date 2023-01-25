import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class Person {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private String firstName;
    private String lastName;
    private int birthYear;

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input First Name");
        String fName = br.readLine();
        System.out.println("Input Last Name");
        String lName = br.readLine();
        String year = "";


        while(!Pattern.matches("\\d+", year)) {
            System.out.println("Input correct year format \"YYYY\"");
            year = br.readLine();
        }
        this.firstName = fName;
        this.lastName = lName;
        this.birthYear = Integer.parseInt(year);
    }


    public Person() {
        counter.incrementAndGet();
    }

    public Person(String firstName, String lastName) {
        counter.incrementAndGet();
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void output() {
        System.out.println("User ID - " + this.counter);
        System.out.println("First Name - " + this.firstName);
        System.out.println("Last Name - " + this.lastName);
        if(getAge() > 100) {
            System.out.print("Age are not specified \n \n");
        } else {
            System.out.println("Your Age are - " + getAge() + "\n \n");
        }
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}
