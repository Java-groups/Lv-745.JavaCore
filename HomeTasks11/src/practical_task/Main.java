package practical_task;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run() {

        try {
            System.out.println("Rectangle's square: " +squareRectangle(2, 2));
        } catch (MyException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.toString(ArrayOfPlants()));
        } catch (ColorException e) {
            System.err.println("ColorException - " +e.getMessage());
        } catch (TypeException e) {
            System.err.println("TypeException - " +e.getMessage());
        }

        try{
            System.out.println(Arrays.toString(ArrayWithNoException()));
        } catch (ColorException e) {
            System.err.println("ColorException - " +e.getMessage());
        } catch (TypeException e) {
            System.err.println("TypeException - " +e.getMessage());
        }

    }

    private static int squareRectangle(int a, int b) throws MyException {
        int square = a * b;
        if (a >= 0 && b >= 0) {
            return square;
        }  else { // Create and call exception
            throw new MyException("input value is below zero!");
        }
    }

    private static Plant[] ArrayOfPlants() throws ColorException, TypeException {
        Plant[] plants = new Plant[5];
        plants[0] = new Plant(5 , "RED", "TREES");
        plants[1] = new Plant(6 , "BLUE", "CREEPERS");
        plants[2] = new Plant(7 , "White", "CLIMBERS");
        plants[3] = new Plant(8 , "GREEN", "Bereza");
        plants[4] = new Plant(9 , "NoColor", "CREEPERS");
        return plants;
    }

    private static Plant[] ArrayWithNoException() throws ColorException, TypeException {
        Plant[] plant = new Plant[5];
        plant[0] = new Plant(1 , "RED", "TREES");
        plant[1] = new Plant(2 , "BLUE", "CREEPERS");
        plant[2] = new Plant(3 , "BLUE", "TREES");
        plant[3] = new Plant(4 , "GREEN", "TREES");
        plant[4] = new Plant(5 , "GREEN", "CREEPERS");
        return plant;
    }
}
