public class Main {
    private static Object showPerson;

    public static void main(String[] args) {
        showPerson();
    }
    public static void showPerson() {
        Person persons[] = new Person[4];
        persons[0] = new Teacher("Arina", 20000);
        persons[1] = new Cleaner("Evgen", 12000);
        persons[2] = new Student("Oleg");
        persons[3] = new Student("Oksana");

        for (Person human : persons) {
            if (human instanceof Person) {
                human.print();
            }else {
                System.out.println("Error");
            }
        }
    }
}