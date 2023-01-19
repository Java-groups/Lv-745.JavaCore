package task3.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        System.out.println(3.14 * r * r);
        System.out.println(2 * 3.14 * r);

    }
}
