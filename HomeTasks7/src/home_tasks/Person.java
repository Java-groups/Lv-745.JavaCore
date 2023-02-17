package home_tasks;

public abstract class Person {

    private final int age;
    private final FullName FullName = new FullName();

    abstract String activity();

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        FullName.firstName = firstName;
        FullName.lastName = lastName;
    }

    public String info() {
        return this.FullName.info() + ", Age: " + age;
    }


    private static class FullName {
        private String firstName;
        private String lastName;

        public String info() {
            return "firstName='" + firstName + ", lastName='" + lastName;
        }
    }
}
