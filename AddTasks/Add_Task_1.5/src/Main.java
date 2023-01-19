import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours : ");
        int hours = sc.nextInt();

        System.out.print("Enter minutes : ");
        int minutes = sc.nextInt();

        System.out.print("Enter seconds : ");
        int seconds = sc.nextInt();

        System.out.println("result = " +CalculateInMiliseconds(hours, minutes, seconds));
    }

    public static int CalculateInMiliseconds(int x, int y, int z) {
        int result = x * 60 * 60 * 1000 + y * 60 * 1000 + z * 1000;
        return result;
    }
}
