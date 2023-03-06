package homeWork13.FuncInterfacesDataApi.homeWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.function.Function;

public class EncryptionUtil {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String s;
    private static int n;
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("===== Task 1 =====");
        firstTask();
        System.out.println("===== Task 2 =====");
        secondTask();
        System.out.println("===== Task 3 =====");
        thirdTask();
        System.out.println("===== Task 4 =====");
        fourthTask();
    }

    //====== Task 1
    public static void firstTask(){
        String message = "Java is difficult language programing";
        int key = 3;
        String encrypted = encrypt(message, key);
        String decrypted = decrypt(encrypted, key);
        System.out.println("Message: " + message);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }

    public static String encrypt(String s, int n) {
        Function<Character,Character> moved = character -> (char) (character + n);
   return changedString(s,moved);
    }

    public static String decrypt(String s, int n) {
        Function<Character,Character> moved = character -> (char) (character - n);
        return changedString(s,moved);
    }

    private static String changedString (String s ,Function<Character,Character>f ) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            stringBuilder.append(f.apply(c));
        }
        return stringBuilder.toString();
    }

        // ======Second Task ========
        public static void secondTask() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter date in format \"mm.dd.yy\": ");
            String input = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            try {
                LocalDate date = LocalDate.parse(input, formatter);
                System.out.println("Date is valid");
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date");
            }
        }

        //====== Task 3 =========
   public static void thirdTask(){
        Scanner scanner1 = new Scanner(System.in);
        Scanner year = scanner1 ;
        boolean isLeap = Year.of(scanner1.nextInt()).isLeap();
       System.out.println("Enter leap year");
       System.out.println(isLeap);
    }
    //======= Task 4 =======
    public static void fourthTask(){
        LocalDate birthday;
        birthday = LocalDate.of(1999,3,23);
        System.out.println("Day of the week : " + birthday.getDayOfWeek());
        LocalDate dateAfter6Months = birthday.plusMonths(6);
        System.out.println("After 6 months: " +dateAfter6Months.getDayOfWeek());
        LocalDate dateAfter12Months = birthday.plusMonths(12);
        System.out.println("After 12 month :" + dateAfter12Months.getDayOfWeek());
    }
}