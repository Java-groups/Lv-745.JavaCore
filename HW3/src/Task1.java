import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three float numbers: ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();

        boolean allInRange = num1 >= -5 && num1 <= 5
                && num2 >= -5 && num2 <= 5
                && num3 >= -5 && num3 <= 5;

        if (allInRange) {
            System.out.println("All three numbers are in the range [-5, 5]");
        } else {
            System.out.println("At least one number is not in the range [-5, 5]");
        }
    }
}