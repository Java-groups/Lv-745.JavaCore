package practical.tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
2. Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".
*/
public class PracticalTask2 {
    String answer;
    public String readAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How are you? ");
        answer = br.readLine();
        return "You are " + answer;
    }
}