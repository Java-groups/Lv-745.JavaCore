import junit.framework.TestCase;
import org.junit.*;

public class CarTest extends TestCase {
    private Car car;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        car = new Car("Crossover", 2020,2.0);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetType() {
        assertEquals("Crossover",car.getType());
    }

    @Test
    public void testSetType() {
        car.setType("SUV");
        assertEquals("SUV",car.getType());
    }

    @Test
    public void testGetYear() {
        assertEquals(2020, car.getYear());
    }

    @Test
    public void testSetYear() {
        car.setYear(2021);
        assertEquals(2021, car.getYear());
    }

    @Test
    public void testGetCapacity() {
        assertEquals(2.0, car.getCapacity());
    }

    @Test
    public void testSetCapacity() {
        car.setCapacity(3.0);
        assertEquals(3.0, car.getCapacity());
    }

    @Test
    public void testTestToString() {
        assertEquals("Car{type='Crossover', year=2020, capacity=2.0}", car.toString());
    }
}