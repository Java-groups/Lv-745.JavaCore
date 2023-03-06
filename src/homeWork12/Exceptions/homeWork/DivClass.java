package homeWork12.Exceptions.homeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivClass {

    public static void  main(String[] args) {


        try {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first number");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter second number");
            double secondNumber = scanner.nextDouble();
            System.out.println(" result " + firstNumber / secondNumber);
            System.out.println("result");
        } catch (InputMismatchException e) {
            System.out.println("enter number");
        } catch (Exception ex) {
            System.out.println("Exception");
        }

    }
}
