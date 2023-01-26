package Main;
import circle.Circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException, IOException {

        Circle circle1 = new Circle();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the flower bed radius");
        circle1.setRadius(Double.parseDouble(br.readLine()));


        System.out.println("The perimetr of the Flower bed = " +circle1.CalculatePerimetr());
        System.out.println("The area of the Flower bed = " +circle1.CalculateAreas());


    }
}

