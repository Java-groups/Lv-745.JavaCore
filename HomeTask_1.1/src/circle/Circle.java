package circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Circle {
    final double Pi = 3.1415926536;
    private double radius;
    private double perimetr;
    private double area;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double CalculatePerimetr() {
        perimetr =  2 * radius * Pi;
        return perimetr;
    }

    public double CalculateAreas() {
        area = 2 * radius * radius;
        return area;
    }

}
