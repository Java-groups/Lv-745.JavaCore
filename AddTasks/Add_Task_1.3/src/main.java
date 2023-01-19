import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of cuboid: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of cuboid: ");
        double width  = sc.nextDouble();
        System.out.print("Enter the height of cuboid: ");
        double height  = sc.nextDouble();

        System.out.println("The volume of cuboid is = " +CalculateVolume(length , width , height));
    }

    public static double CalculateVolume(double x, double y, double z) {

        double result = x * y * z ;
        return result;
    }
}
