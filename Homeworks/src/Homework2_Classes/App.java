package Homework2_Classes;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Galya", "Naumova");
        p1.setBirthYear(1989);
        Person p2 = new Person("Galya", "Bulatova");
        p2.setBirthYear(1980);
        Person p3 = new Person("Nataliia", "Salo");
        p3.setBirthYear(1985);
        Person p4 = new Person();
        p4.setFirstName("Pavlina");
        p4.setLastName("Filatova");
        p4.setBirthYear(1965);
        Person p5 = new Person();
        p4.setFirstName("Lisa");
        p4.setLastName("Filenko");
        p4.setBirthYear(1995);
    }
}
