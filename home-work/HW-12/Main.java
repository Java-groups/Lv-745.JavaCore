import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        String plainText = "hello world";
        int shift = 3;
        String encryptedText = encrypt(plainText, shift);
        System.out.println("Encrypted text: " + encryptedText);
        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted text: " + decryptedText);

        String date = "02.29.20";
        boolean valid = validateDate(date);
        System.out.println("Date " + date + " is valid: " + valid);

        int year = 2024;
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " is a leap year: " + isLeap);

        LocalDate birthday = LocalDate.of(1990, 3, 15);
        printDayOfWeek(birthday);    }

        public static String encrypt(String s, int n) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) {
                    char encrypted = (char) ((c - 'a' + n) % 26 + 'a');
                    result.append(encrypted);
                } else {
                    result.append(c);
                }
            }
            return result.toString();
        }
        public static String decrypt(String s, int n) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) {
                    char decrypted = (char) ((c - 'a' + 26 - n) % 26 + 'a');
                    result.append(decrypted);
                } else {
                    result.append(c);
                }
            }
            return result.toString();
        }

    public static boolean validateDate(String date) {
        String[] parts = date.split("\\.");
        if (parts.length != 3) {
            return false;
        }
        int month, day, year;
        try {
            month = Integer.parseInt(parts[0]);
            day = Integer.parseInt(parts[1]);
            year = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int maxDay = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                maxDay = 29;
            } else {
                maxDay = 28;
            }
        }
        if (day < 1 || day > maxDay) {
            return false;
        }
        return true;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printDayOfWeek(LocalDate date) {
        System.out.println("Day of the week: " + date.getDayOfWeek().toString());
        LocalDate after6Months = date.plusMonths(6);
        System.out.println("Day of the week after 6 months: " + after6Months.getDayOfWeek().toString());
        LocalDate after12Months = date.plusMonths(12);
        System.out.println("Day of the week after 12 months: " + after12Months.getDayOfWeek().toString());
    }

}