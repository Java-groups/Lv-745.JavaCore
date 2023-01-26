package task5.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Call to Germany per minute");
        int GR = Integer.parseInt(br.readLine());
        System.out.println("Talks continued to Germany");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("All price to Germany");
        System.out.println(GR * t1);

        System.out.println("Call to France per minute");
        int FR = Integer.parseInt(br.readLine());
        System.out.println("Talks continued to France");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("All price to France");
        System.out.println(FR * t2);

        System.out.println("Call to UK per minute");
        int UK = Integer.parseInt(br.readLine());
        System.out.println("Talks continued to UK");
        int t3 = Integer.parseInt(br.readLine());
        System.out.println("All price to UK");
        System.out.println(UK * t3);
        int a = GR * t1;
        int b = FR * t2;
        int c = UK * t3;
        System.out.println("All price to all countries");
        System.out.println(a + b + c);
    }
}
