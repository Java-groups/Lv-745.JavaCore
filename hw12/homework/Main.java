import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class Main {

    public static String encrypt(String s, int n) {

        Function<Character, Character> shiftFunction = c -> (char) (c + n);

        StringBuilder stringBuilder = new StringBuilder();
        for (char stringElement : s.toCharArray()) {
            stringBuilder.append(shiftFunction.apply(stringElement));
        }

        return stringBuilder.toString();
    }

    public static String decrypt(String s, int n) {

        Function<Character, Character> shiftFunction = c -> (char) (c - n);

        StringBuilder stringBuilder = new StringBuilder();
        for (char stringElement : s.toCharArray()) {
            stringBuilder.append(shiftFunction.apply(stringElement));
        }

        return stringBuilder.toString();
    }

    public static boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(dateStr, formatter);
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

        LocalDate afterSixMonths = date.plusMonths(6);
        DayOfWeek dayOfWeekAfterSixMonths = afterSixMonths.getDayOfWeek();
        System.out.println("Day of the week after 6 months: " + dayOfWeekAfterSixMonths);

        LocalDate afterTwelveMonths = date.plusMonths(12);
        DayOfWeek dayOfWeekAfterTwelveMonths = afterTwelveMonths.getDayOfWeek();
        System.out.println("Day of the week after 12 months: " + dayOfWeekAfterTwelveMonths);
    }
    public static void main(String[] args) {
        System.out.println(
                """
                HOMEWORK TASKS
                1. Create two methods String encrypt(String s, int n) and String decrypt(String s, int n)
                Method encrypt should take a string and return coded string,
                where every letter is moved on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“).
                Method decrypt should return decoded value
                2. Create method to validate date according to format "mm.dd.yy"
                3. Create method which take year as a parameter and return true if year is a leap
                4. Create variable LocalDate birthday and set to that variable date your birthday.
                Create method that take as a parameter object LocalDate and print the day of the week
                and what was the day of the week after 6 months
                and what was the day of the week after 12 months.
                """);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //HOMEWORK TASK 1
        String originalText = "I like Java";
        final int shiftNumber = 3;
        String encryptedText = encrypt(originalText, shiftNumber);
        String decryptedText = decrypt(encryptedText, shiftNumber);
        System.out.println("Message: " + originalText + "\nEncrypted: " + encryptedText + "\nDecrypted: " + decryptedText);


        //HOMEWORK TASK 2
        String dateText = null;
        System.out.print("Input date (format \"mm.dd.yy\"): ");
        try {
            dateText = br.readLine();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        System.out.println("Date " + (isValidDate(dateText)?"valid":"unvalid") + "\n");

        //HOMEWORK TASK 3
        int year = LocalDate.now().getYear();
        System.out.println(year + " is a leap year? " + isLeapYear(year));

        //HOMEWORK TASK 4
        LocalDate birthday = LocalDate.of(2004, 1, 24);
        printDayOfWeek(birthday);
    }
}
