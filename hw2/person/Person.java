package person;

import java.time.Year;
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){

    }

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person (String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge(){
        if (birthYear==0){return 0;}
        return Year.now().getValue() - birthYear;
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

    public void input (Person person, Object ... inputInfo) {

    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void input (String field, String value){
        if (field == "firstName") { setFirstName(value);}
        if (field == "lastName") { setLastName(value);}
        if (field == "birthYear") {
            int bYear = Integer.parseInt(value);
            setBirthYear(bYear);
        }
    }

    public String output() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
