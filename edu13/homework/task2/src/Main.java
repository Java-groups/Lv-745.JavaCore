import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter date in format \"mm.dd.yy\"");
        String dateString = br.readLine();
        try {
            LocalDate date = validateDate(dateString);
            System.out.println("Valid date: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date: " + dateString);
        }
    }


        public static LocalDate validateDate(String dateString) throws DateTimeParseException {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            LocalDate date = LocalDate.parse(dateString, formatter);
            return date;
        }
    }