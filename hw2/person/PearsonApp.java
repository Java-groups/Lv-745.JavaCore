package person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PearsonApp {
    public static void main(String[] args) throws IOException {
        Person[] personsArr = new Person[10];
        Person donald = new Person("Donald", "Duck");
        donald.setBirthYear(2000);
        personsArr[0] = donald;
        Person bob = new Person("Bob", "Sponge");
        bob.setBirthYear(1996);
        personsArr[1] = bob;
        Person bugs = new Person("Bugs", "Bunny");
        bugs.setBirthYear(2010);
        personsArr[2] = bugs;
        Person homer = new Person("Homer", "Simpson");
        personsArr[3] = homer;
        personsArr[4] = new Person("Panther", "Pink");
        personsArr[4].setBirthYear(1969);
        System.out.println(homer.output());
        System.out.println(personsArr[0].output());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int selector = -1;
        int personId;
        int newPersonId = 5;
        while (selector !=0){
            System.out.println("SELECT MENU ITEM");
            System.out.println("1 - show all records");
            System.out.println("2 - show one record");
            System.out.println("3 - add record");
            System.out.println("0 - exit");

            selector = Integer.parseInt(br.readLine());
            if (selector==1) {
                for (int i = 0; i < newPersonId; i++) {
                    System.out.println(personsArr[i].output());
                }
            }

            if (selector==2){
                System.out.println("Enter record number:");
                personId= Integer.parseInt(br.readLine());
                System.out.println(personsArr[personId].output());
            }

            if (selector == 3){
                personsArr[newPersonId] = new Person();
                System.out.println("Enter first name:");
                personsArr[newPersonId].input("firstName", br.readLine());
                System.out.println("Enter last name:");
                personsArr[newPersonId].input("lastName", br.readLine());
                System.out.println("Enter birth year:");
                personsArr[newPersonId].input("birthYear",br.readLine());
                System.out.println("New record was created: "+ personsArr[newPersonId].output());
                newPersonId++;
            }

        }
    }
}
