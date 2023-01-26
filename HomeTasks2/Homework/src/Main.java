import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person(" Nazz"," P");
        Person person5 = new Person(" Yuri", " KYB");
        person4.setBirthYear(2002);
        person5.setBirthYear(1999);

        // Inputting info
        System.out.println("Input info about 1st person");
        person1.input();
        System.out.println("Input info about 2nd person");
        person2.input();
        System.out.println("Input info about 3rd person");
        person3.input();

        // Checking outputted info
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

        // Changing something
        System.out.println("Do you want to change smb info? Enter : \n 1 -- yes \n 2 -- nope");
        if (sc.nextInt() == 1) {
            System.out.print("Enter the number of person -- ");
            switch (sc.nextInt()) {
                case 1 -> person1.changeName();
                case 2 -> person2.changeName();
                case 3 -> person3.changeName();
                case 4 -> person4.changeName();
                case 5 -> person5.changeName();
                default -> System.out.println("Any of person have this number ( choose between 1 and 5 )");
            }
        } else {
            System.out.println("\n Oke, your results: ");
        }

        person5.changeName("Lina", "Luna");

        // Checking outputted info after changing
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

    }
}
