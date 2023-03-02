package homeWork8OOP_InterfacesPolymorfizm.practicalTask2;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0]=new Teacher("Tamara Andriyivna");
        person[1]=new Cleaner("Stiopa");
        person[2]=new Cleaner("Volodia");
        person[3]=new Student("Max");
        person[4]=new Teacher("Fedir Ivanovych");

        for (Person persons : person){
            persons.print();
        }
        for (Person persons : person){
            if (persons instanceof Teacher){
                ((Teacher)persons).salary();
            }else if (persons instanceof Cleaner){
                ((Cleaner)persons).salary();
            }

        }
    }
}
