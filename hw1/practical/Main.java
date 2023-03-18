package practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
            }
        }
        while (choice != 0);
    }
}