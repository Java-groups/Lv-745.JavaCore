import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("received integer : " +CountDouble());
    }

    private static int CountDouble() {
        System.out.print("Enter the integer : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return 2 * number ;
    }
}
