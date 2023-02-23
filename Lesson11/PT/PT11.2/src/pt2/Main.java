package pt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname, name and patronymic: ");
        String str = scanner.nextLine();

        String[] str1 = str.split(" ");
        String surname = str1[0];
        String name = str1[1];
        String patronymic = str1[2];

        System.out.println("Surnames and initials: " + surname + " " + name.charAt(0) + "." + patronymic.charAt(0) + ".");
        System.out.println("Name: " + name);
        System.out.println("Name, middle name, and last name: " + name + " " + patronymic + " " + surname);


    }
}
