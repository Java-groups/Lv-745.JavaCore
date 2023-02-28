package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter the number of month: ");
        try {
            int numberOfMonth = Integer.parseInt(br.readLine());
            int w = numberOfMonth - 1;
            System.out.println("The number of days in this month is " + monthDays[w]);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Wrong enter");
        }
    }
}
