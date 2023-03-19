import junit.framework.TestCase;
import org.junit.*;
import org.junit.jupiter.api.Test;

public class CarTest extends TestCase {
    private Car car = new Car("Mitsubishi", 2021,140);
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        CarTest.counter = counter;
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        setCounter(getCounter()+1);
    }

    @After
    public void tearDown() {
        System.out.println("Test " +  getCounter() + " done!");
    }

    @Test
    public void testCarNotNull(){
          assertNotNull("Car Null",car);
    }

    @Test
    public void testEngineCapacity() {
        car.setEngineCapacity(110);
        assertEquals(110, car.getEngineCapacity());
    }

    @Test
    public void testType() {
        car.setType("Toyota");
        assertEquals("Toyota", car.getType());
    }

    @Test
    public void testYearProduction() {
        car.setYearProduction(2022);
        assertEquals(2022, car.getYearProduction());
    }

    @Test
    public void testToString() {
        assertEquals("Car{type=Mitsubishi, yearProduction=2021, engineCapacity=140}", car.toString());
    }
}