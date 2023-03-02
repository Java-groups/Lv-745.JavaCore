package practick;

import java.time.LocalDate;
import java.time.Period;

public class Beetwen {
    public static void main(String[] args) {


        LocalDate nextBirthday = LocalDate.of(1999, 8, 5);
        LocalDate now = LocalDate.now();

        Period period = Period.between(now, nextBirthday);
        int days = period.getDays();

        System.out.println(now);
        System.out.println(period);
        System.out.println(days);
    }
}
