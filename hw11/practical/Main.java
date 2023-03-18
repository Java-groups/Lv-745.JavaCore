import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int squareRectangle(int a, int b) throws NegativeValueException {
        if ((a * b) <= 0) {
            throw new NegativeValueException("Oops! Input must be positive `+value` !");
        }
        return a * b;
    }

    public static void main(String[] args)  {
        System.out.println(
                """
                        PRACTICAL TASKS
                        1)Create a method for calculating the area of a rectangle
                        int squareRectangle (int a, int b),
                        which should throw an exception if the user enters negative value. 
                        Input values a and b from console. 
                        Check the squareRectangle method in the method main. 
                        Check to input non-numeric value.
                        2)Create a class Plant, which includes fields int size, Color color and Type type, and constructor where these fields are initialized. 
                        Color and type are Enum. Override the method toString( ).
                        Create classes ColorException and TypeException and describe there all possible colors and types of plants.
                        In the method main create an array of five plants.
                        Check to work your exceptions.          
                        """);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //PRACTICAL TASK 1
        int length = 0;
        int width = 0;
        int area;
        System.out.println("Enter length and width of rectangle, each from new line: ");
        try {
            length = Integer.parseInt(br.readLine());
            width = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Oops! Enter integer value!");
        }
        try {
            area = squareRectangle(length, width);
            System.out.println("Area of rectangle: " + area);
        } catch (NegativeValueException e){
            System.err.println(e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }

        //PRACTICAL TASK 2
        try {
              Plant[] plants = new Plant[5];
              plants[0] = new Plant(2, "RED", "MOSSE");
              plants[1] = new Plant(3, "INDIGO", "FERN");
              plants[2] = new Plant(4, "ORANGE", "FLOWERING");
              plants[3] = new Plant(5, "YELLOW", "GYMNOSPERM");
              plants[4] = new Plant(6, "WHITE", "TREE");

              for (Plant plant : plants) {
                  System.out.println(plant);
              }
        } catch (ColorException e) {
            System.err.println("No such color! " + e.getMessage());
        } catch (TypeException e) {
            System.err.println("No such type! " + e.getMessage());
        }

    }
}

