package task4.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live, " + name + "?");
        String address = br.readLine();
        System.out.println(name + " live in " + address + ".");

    }
}
