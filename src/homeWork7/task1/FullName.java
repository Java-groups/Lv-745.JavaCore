package homeWork7.task1;


public class FullName {
    private String firstName;
    private String lastName;

    public FullName(){}
    public FullName(String firstName, String lastName) {
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

    public String info() {
        return "First name: " + firstName + ", Last name: " + lastName;
    }
}