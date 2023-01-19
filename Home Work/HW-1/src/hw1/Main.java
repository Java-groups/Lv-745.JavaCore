package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = reader.readLine();
        System.out.println("Where are you live? " + name);
        String place = reader.readLine();
        System.out.println(name + " You are live in the " + place);

        System.out.println("Radius:");
        int radius = Integer.parseInt(reader.readLine());
        System.out.println("Площа: " + Math.round(Math.PI * radius * radius));
        System.out.println("Периметр: " + Math.round(2 * Math.PI * radius));

        Calls first = new Calls(2, 4, 5, 6, 7, 4);
        first.output();
    }
}
