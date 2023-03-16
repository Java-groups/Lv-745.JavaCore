package practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1. Define integer variables a and b. Read values a and b from Console and calculate:
        a + b
        a - b
        a * b
        a / b.
        Output obtained results.
*/
public class PracticalTask1 {
    int a, b;
    public void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter b: ");
        b = Integer.parseInt(br.readLine());
    }
    public int sum() {
        return a + b;
    }
    public int difference() {
        return a - b;
    }
    public int multiply() {
        return a * b;
    }
    public int division() {
        return a / b;
    }
}