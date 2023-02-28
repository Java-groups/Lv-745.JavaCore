import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void testCarGetTypeMethod() {
        Car cars = new Car("Volvo", 2020, 2.0);
        assertEquals("Volvo", cars.getType());
    }

    @Test
    public void testCarSetTypeMethod() {
        Car cars = new Car("BMW", 2023, 1.6);
        cars.setType("Opel");
        assertEquals("Opel", cars.getType());
    }

    @Test
    public void testCarGetYearMethod() {
        Car cars = new Car("Volvo", 2020, 2.0);
        assertEquals(2020, cars.getYear());
    }

    @Test
    public void testCarSetYearMethod() {
        Car cars = new Car("Volvo", 2020, 2.0);
        cars.setYear(2019);
        assertEquals(2019, cars.getYear());
    }

}

