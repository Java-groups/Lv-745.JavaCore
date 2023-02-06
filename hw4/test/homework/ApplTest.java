package homework;

import junit.framework.TestCase;

import java.io.*;

public class ApplTest extends TestCase {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private final ByteArrayOutputStream testOut = new ByteArrayOutputStream();

    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    public void setUp() throws Exception {
        super.setUp();
        System.setOut(new PrintStream(testOut));
    }

    public void tearDown() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    public void testMain() {
    }

    public void testTaskOne() throws IOException {
        String outputInConsole = "Enter number of the month:Days in December is: 31";
        provideInput("12");
        Appl.taskOne();
        assertEquals(outputInConsole,getOutput().trim());
    }

    public void testGetDaysInMonth() {
        assertEquals(Appl.getDaysInMonth(2),28);

    }

    public void testGetNameOfMonth() {
        assertEquals(Appl.getNameOfMonth(3), "March");
    }

    public void testTaskTwo() {
    }

    public void testTaskTwoResult() {
        int [] enteredIntegers = {1,2,3,4,-5,3,4,5,10,6};
        assertEquals(Appl.taskTwoResult(enteredIntegers),"Product of last five elements: 3600");
    }

    public void testTaskTree() {
    }

    public void testSecondPositiveInt() {
        int [] enteredIntegers = {1,-2,-3,4,-5};
        assertEquals(Appl.secondPositiveInt(enteredIntegers),4);
    }

    public void testMinValuePosition() {
        int [] enteredIntegers = {1,-2,-3,4,-5};
        assertEquals(Appl.minValuePosition(enteredIntegers)[0],-5);
        assertEquals(Appl.minValuePosition(enteredIntegers)[1],5);
    }

    public void testProductOfEvens() {
        int [] enteredIntegers = {1,-2,-3,4,-5};
        assertEquals(Appl.productOfEvens(enteredIntegers),-8);
    }

    public void testTaskFour() throws IOException {
        final String carsYear = "2018";
        final String outputInConsole = """
                Enter the field year:Car{type='Hatchback', year=2018, capacity=1.0}
                Car{type='Sedan', year=2018, capacity=1.6}
                Total cars in 2018: 2
                Cars list ordered by year
                Car{type='Hatchback', year=2018, capacity=1.0}
                Car{type='Sedan', year=2018, capacity=1.6}
                Car{type='Wagon', year=2020, capacity=2.0}
                Car{type='SUV', year=2022, capacity=2.5}""";
        provideInput(carsYear);
        Appl.taskFour();
        assertEquals(outputInConsole,getOutput().trim());
    }

    public void testCarsByYears() {
        Car[] cars = new Car[6];
        cars[0] = new Car("Wagon", 2020,2.0);
        cars[1] = new Car("Hatchback", 2018,1.0);
        cars[2] = new Car("Sedan", 2018,1.6);
        cars[3] = new Car("Micro", 2017,0.9);
        cars[4] = new Car("Coupe", 2018,1.6);
        cars[5] = new Car("SUV", 2022,2.5);
        assertEquals(Appl.carsByYears(cars,2018),3);
    }

    public void testOrderCars() {
        Car[] cars = new Car[6];
        cars[0] = new Car("Wagon", 2020,2.0);
        cars[1] = new Car("Hatchback", 2018,1.0);
        cars[2] = new Car("Sedan", 2018,1.6);
        cars[3] = new Car("Micro", 2017,0.9);
        cars[4] = new Car("Coupe", 2018,1.6);
        cars[5] = new Car("SUV", 2022,2.5);
        Car [] orderedCar = Appl.orderCars(cars);
        for (int i = 1; i<orderedCar.length; i++){
            assertTrue(orderedCar[i-1].getYear()<=orderedCar[i].getYear());
        }
    }
}