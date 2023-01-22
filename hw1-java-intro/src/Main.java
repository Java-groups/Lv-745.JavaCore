import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import hw.tasks.*;
import practical.tasks.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte choice;
        do {
            System.out.print("""
                ___________________________________________________________
                Menu of tasks:
                0.Exit
                1.practical-task1
                2.practical-task2
                3.hw-task1
                4.hw-task2
                5.hw-task3
                6.additional-task-you-cant-code-under-pressure-number-1
                7.additional-task-function-3-multiplying-two-numbers
                8.additional-task-volume-of-a-cuboid
                9.additional-task-jennys-secret-message
                10.additional-task-beginner-series-number-2-clock
                11.additional-task-grasshopper-debugEnter
                ___________________________________________________________
                Enter your choice:""");
            choice = Byte.parseByte(br.readLine());
            switch (choice) {
                case 1 -> {
                    PracticalTask1 obj = new PracticalTask1();
                    obj.read();
                    System.out.println("a + b = " + obj.sum() + "\na - b = " + obj.difference() + "\na * b = " + obj.multiply() + "\na / b = " + obj.division());
                }
                case 2 -> {
                    PracticalTask2 obj = new PracticalTask2();
                    System.out.println(obj.readAnswer());
                }
                case 3 -> {
                    HwTask1 obj = new HwTask1();
                    obj.readRadius();
                    DecimalFormat ft = new DecimalFormat("#####.##");
                    System.out.println("Flower bed perimetr: " + ft.format(obj.calculatePerimeter()) + "\narea: " + ft.format(obj.calculateArea()));
                }
                case 4 -> {
                     HwTask2 obj = new HwTask2();
                     System.out.println(obj.readNameAndAddress());
                }
                case 5 -> {
                    HwTask3 obj = new HwTask3();
                    obj.readTimeOfCall();
                    System.out.println(obj.countUnits());
                }
            }
        }
        while (choice != 0);
    }
}