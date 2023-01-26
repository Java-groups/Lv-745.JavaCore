import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    Scanner sc = new Scanner(System.in);

    // 2 Constructors
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters and setters

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return 2023 - birthYear;
    }


    // using Method to input the info
    public void input() {
        System.out.print("Enter the firstName");
        this.firstName = sc.nextLine();
        System.out.print("Enter the lastName");
        this.lastName = sc.nextLine();
        System.out.print("Enter the birthYear");
        this.birthYear = sc.nextInt();
    }

    // using Method to output the info
    public void output() {
        System.out.println("[ firstName -- " +firstName + ", lastName -- " + lastName + ", Age -- " +getAge() + " ]");
    }

    // using Method to change the name
    public void changeName() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\n Enter 1, if u want to change firstName, else if u want to change lastName enter 2, else - any other");
        switch (sc.nextInt()) {
            case 1 -> {
                System.out.print("Enter the correct firstName");
                this.firstName = sc1.nextLine();
            }
            case 2 -> {
                System.out.print("Enter the correct lastName");
                this.lastName = sc1.nextLine();
            }
            default -> {
            }
        }

    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}
