import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Multiply();
    }

    public static int Multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int result = a * b;
        System.out.println("multiply (" + a + "," + b + ") = " + result);
        return result;
    }
}
