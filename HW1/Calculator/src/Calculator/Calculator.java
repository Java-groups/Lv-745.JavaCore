package Calculator;
import java.io.BufferedReader;  
import java.io.IOException; 
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int result;
         System.out.println("Enter first number");
         int a = Integer.parseInt(br.readLine());
         System.out.println("Enter second number");
         int b = Integer.parseInt(br.readLine());
         
           result = a - b;
           System.out.println(a + " - " + b + " = " + result);
           
           result = a + b;
           System.out.println(a + " + " + b + " = " + result);
           
           result = a / b;
           System.out.println(a + " / " + b + " = " + result);
           
           result = a * b;
           System.out.println(a + " * " + b + " = " + result);
    }
}