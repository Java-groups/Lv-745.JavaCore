package practick;

import org.junit.Test;

import java.util.Locale;

public class NumberTest {

    @Test
    public void testInteger(){
        int watermellons = 1000654;
        System.out.printf(Locale.ITALY,"i have %+,-20d watemellons in my garage",watermellons);
    }

   @Test
    public void testFloats(){
        float price = 1323000.12423415314534f;
        double pricedouble = 64363000.12423415314534f;
        System.out.printf("the price is %f" , price);
}
}
