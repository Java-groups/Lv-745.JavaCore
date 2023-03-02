package Task4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader nm = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = nm.readLine();
        System.out.println("Hello " + name);
        System.out.println("Where are you live?");
        String adrees = nm.readLine();
        System.out.println("So your name  " + name + " and you live on " + adrees  + " city");


    }
}
