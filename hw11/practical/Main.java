import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--------FIRST TASK. Create a method for calculating the area of a rectangle. ----------");
        taskOne();
        Thread.sleep(400);
        System.out.println("--------SECOND TASK. Enter a sentence that contains the words between more than one space.----------");
        taskTwo();
    }

    private static void taskOne(){
        int length = 0; int width = 0; int area;
        boolean isNonInteger = true;
        System.out.print("Enter length of rectangle: ");
        while (isNonInteger) {
            try {
                length = Integer.parseInt(scanner.nextLine());
                isNonInteger = false;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a number.");
            }
        }

        isNonInteger = true;
        System.out.print("Enter width of rectangle: ");
        while (isNonInteger) {
            try {
                width = Integer.parseInt(scanner.nextLine());
                isNonInteger = false;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a number.");
            }
        }
        try {
            area = squareRectangle(length, width);
            System.out.println("Area of rectangle: " + area);
        } catch (NegativeValueException e){
            System.err.println(e.getMessage());
        }
    }

    private static int squareRectangle(int a, int b) throws NegativeValueException {
        if (a <= 0 || b <= 0) {
            throw new NegativeValueException("Length and width must be positive.");
        }
        return a * b;
    }
    private static void taskTwo(){
        Plant[] plants = new Plant[5];
        try {
            plants[0] = new Plant(10, "RED", "FLOWER");
            plants[1] = new Plant(5, "BLUE", "TREE");
            plants[2] = new Plant(8, "YELLOW", "SHRUB");
            plants[3] = new Plant(6, "PURPLE", "TREE");
            plants[4] = new Plant(12, "GEEN", "FLOWER");
        } catch (ColorException e) {
            System.err.println("Error creating plant: " + e.getMessage());
        } catch (TypeException e) {
            System.err.println("Error creating plant: " + e.getMessage());
        }

        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }


}
