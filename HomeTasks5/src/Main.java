import AutoPractical_1.*;
import BirdHomework_1.Bird;
import BirdHomework_1.CanFly.Eagle;
import BirdHomework_1.CanFly.Swallow;
import BirdHomework_1.CanNotFly.Chicken;
import BirdHomework_1.CanNotFly.Penguin;
import EmployeeHomework_2.Developer;
import EmployeeHomework_2.Employee;
import ShapePractical_2.*;


public class Main {
    public static void main(String[] args) {

        // AutoPractical_1

        Car[] cars1 = new Sedan[1];
        Car[] cars2 = new Truck[2];
        cars1[0] = new Sedan("Chrysler 300", 220, 2017, 3);
        cars2[0] = new Truck("Volvo FH16", 170, 2013,20_000);
        cars2[1] = new Truck("GMC Canyon", 200, 2022,7000);

        runCar(cars1[0]);
        runCar(cars2[0]);
        runCar(cars2[1]);

        System.out.println("\n");

        // ShapePractical_2

        // Creating 2 instances of Point
        Point p1 = new Point(5, 10);
        Point p2 = new Point(2 , 5);

        // Creating a massive
        Line[] lines1 = new Line[2];

        /*You can creant object Line write something like that = new Line(new Point(5, 10), new Point(2 , 5));
        There is no need to create 2 point objects before this*/
        lines1[0] = new Line(p1,p2);
        lines1[1] = new ColorLine(p1,p2,"red"); // Polymorphism


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(lines1[0]);
        System.out.println(lines1[1]);

        // BirdHomework_1
        /*And there you can create and put all object in array write something like that 
        = new Bird{new Eagle("brown and white", false), new Swallow("blue and white", false) etc...};*/
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("brown and white", false);
        birds[1] = new Swallow("blue and white", false);
        birds[2] = new Penguin("black and white", true);
        birds[3] = new Chicken("pied", true);

        for(Bird bird: birds) {
            bird.fly();
            System.out.println(bird);
        }

        // EmployeeHomework_2
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("NazzP", 19, 15500.25);
        employees[1] = new Developer("Taras", 32, "Average Java developer", 32735.35);
        System.out.println(employees[0].report());
        System.out.println(employees[1].report());
    }

    // AutoPractical_1
    private static void runCar(Car car) {
        System.out.println(car.toString());
        car.run();
        car.stop();
    }
}
