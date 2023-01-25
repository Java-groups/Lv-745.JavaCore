package person;

public class PearsonApp {
    public static void main(String[] args) {
        Person donald = new Person("Donald", "Duck");
        donald.setBirthYear(2000);
        Person bob = new Person("Bob", "Sponge");
        bob.setBirthYear(1996);
        Person bugs = new Person("Bugs", "Bunny");
        bugs.setBirthYear(2010);
        Person homer = new Person("Homer", "Simpson");
        homer.input("birthYear", "1999");
        Person panther = new Person("Panther", "Pink");
        panther.setBirthYear(1969);
        System.out.println(homer.output());
    }
}
