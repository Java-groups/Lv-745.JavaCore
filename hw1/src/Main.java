import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        task1();
        task2();
        task3();
    }
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static double circumferenceOfCircle(int radius) {
        return PI * (2 * radius);
    }
    public static double areaOfCircle(int radius) {
        return PI * pow(radius, 2);
    }

    public static void task1 () throws IOException {
        System.out.println("TASK 1");
        System.out.println("Enter radius of flower bed:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int radius = Integer.parseInt(br.readLine());
        System.out.println("Circumference of the Circle = " + df.format(circumferenceOfCircle(radius)));
        System.out.println("Area of the Circle = " + df.format(areaOfCircle(radius)));
    }

    public static void task2 () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nTASK 2");
        System.out.println("What is your name?");
        String personName = br.readLine();
        System.out.println("Where are you live, "+personName+"?");
        String personAddress = br.readLine();
        System.out.println (personName + " lives: " + personAddress);
    }

    public static void task3 () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nTASK 3");
        System.out.println("Enter duration of calls to Ukraine");
        double callsUkr = Integer.parseInt(br.readLine())*1.21;
        System.out.println("Enter duration of calls to Poland");
        double callsPol = Integer.parseInt(br.readLine())*1.43;
        System.out.println("Enter duration of calls to Germany");
        double callsGer = Integer.parseInt(br.readLine())*1.67;
        double total = callsGer+callsPol+callsUkr;
        System.out.println("The cost of calls:");
        System.out.println("Ukraine:\t" + df.format(callsUkr));
        System.out.println("Poland:\t\t" + df.format(callsPol));
        System.out.println("Germany:\t" + df.format(callsGer));
        System.out.println("Total:\t\t"+ df.format(total));

    }
}