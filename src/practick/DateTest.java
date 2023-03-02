package practick;

import org.junit.Test;

import java.time.LocalDateTime;

public class DateTest {
    @Test
    public void testDate(){
        System.out.printf("today is %1$td %1$tB %1$tY", LocalDateTime.now());
        System.out.printf("%n Time is  %1$tH %1$tM %1$tS", LocalDateTime.now());
    }
}
