
public class FullName {
    private String firstName;
    private String lastName;

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
    public FullName(){}
    public FullName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    @Override
    public String toString() {
        return "First name: " + getFirstName() + ", Last name: " + getLastName();
    }
}

