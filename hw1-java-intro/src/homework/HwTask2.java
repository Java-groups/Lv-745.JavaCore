package homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Define String variables name and address.
Output question "What is your name?"
Read the value name and output next question: “Where are you live, (name)?".
Read address and write whole information
*/
public class HwTask2 {
    String name, address;
    public String readNameAndAddress() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name? ");
        name = br.readLine();
        System.out.print("Where do you live, " + name +"? ");
        address = br.readLine();
        return name + " live in " + address;
    }
}