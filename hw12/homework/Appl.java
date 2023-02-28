import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class Appl {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        System.out.println("--------TASK ONE. Create two methods String encrypt and String decrypt. ----------");
        taskOne();
        System.out.println("--------TASK TWO. Create two methods String encrypt and String decrypt. ----------");
        taskTwo();
        System.out.println("--------TASK THREE.Create method which take year as a parameter and return true if year is a leap.---");
        taskThree();
        System.out.println("--------TASK FOUR.Create variable LocalDate birthday and set to that variable date your birthday.---");
        taskFour();
    }
    public static void taskOne(){
        String message = "Hello, world!";
        int key = 3;
        String encrypted = encrypt(message, key);
        String decrypted = decrypt(encrypted, key);
        System.out.println("Message: " + message);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }

    public static void taskTwo() {
        String dateStr;
        System.out.print("Input date in format \"mm.dd.yy\": ");
        try {
            dateStr = br.readLine();
        } catch (Exception e){
            System.err.println(e.getMessage());
            return;
        }
        if (isValidDate(dateStr)){
            System.out.println("Date is valid");
        } else {
            System.out.println("Date is not valid");
        }
    }

    public static void taskThree() {
        int year = 2024;
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " is a leap year? " + isLeap);
    }

    public static void taskFour() {
        LocalDate birthday = LocalDate.of(1979, 12, 14);
        printDayOfWeek(birthday);
    }

    public static String encrypt(String s, int n) {
        Function<Character, Character> shift = c -> (char) (c + n);
        return transformString(s, shift);
    }

    public static String decrypt(String s, int n) {
        Function<Character, Character> shift = c -> (char) (c - n);
        return transformString(s, shift);
    }

    private static String transformString(String s, Function<Character, Character> f) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(f.apply(c));
        }
        return sb.toString();
    }

    public static boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        LocalDate date;
        try {
            date = LocalDate.parse(dateStr, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        return Year.of(year).isLeap();
    }

    public static void printDayOfWeek(LocalDate date) {
        System.out.println("Day of the week: " + date.getDayOfWeek());
        LocalDate sixMonths = date.plusMonths(6);
        DayOfWeek dayOfWeekSixMonths = sixMonths.getDayOfWeek();
        System.out.println("Day of the week after 6 months: " + dayOfWeekSixMonths);
        LocalDate twelveMonths = date.plusMonths(12);
        DayOfWeek dayOfWeekTwelveMonths = twelveMonths.getDayOfWeek();
        System.out.println("Day of the week after 12 months: " + dayOfWeekTwelveMonths);
    }
}
