package home_task;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;

public class Appl {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        System.out.println("Encrypted: " + encrypt(s, 3));
        System.out.println("Decrypted: " + decrypt(s, 3));

        valDate();

        isLeapYear();

        LocalDate birthday = LocalDate.of(2003, 7, 1);
        weekDayOfBirthday(birthday);


    }

    private static String encrypt(String s, int n) {
        Function<Character, Character> encryption = c -> (char) (c + n);
        return transformString(s, encryption);
    }

    private static String decrypt(String s, int n) {
        Function<Character, Character> decryption = c -> (char) (c - n);
        return transformString(s, decryption);
    }

    private static String transformString(String s, Function<Character, Character> f) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(f.apply(c));
        }
        return sb.toString();
    }

    public static void valDate() {
        System.out.print("Enter the date: ");
        String date = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy", Locale.UK).withResolverStyle(ResolverStyle.STRICT);
        try {
            formatter.parse(date);
            System.out.println("Valid date");
        } catch (Exception e) {
            System.out.println("Invalid date");
        }
    }

    public static void isLeapYear(){
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.println("This year is leap - " +Year.of(year).isLeap());
    }

    public static void weekDayOfBirthday(LocalDate birthday){
        System.out.println("Day of the week -- " +birthday.getDayOfWeek());
        LocalDate plusHalf = birthday.plusMonths(6);
        System.out.println("Day of the week -- " +plusHalf.getDayOfWeek());
        LocalDate plusYear = birthday.plusMonths(12);
        System.out.println("Day of the week -- " +plusYear.getDayOfWeek());

    }


}
