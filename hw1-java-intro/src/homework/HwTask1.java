package homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.
*/
public class HwTask1 {
    double radius;
    double PI = Math.PI;
    public void readRadius() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter radius: ");
        radius = Double.parseDouble(br.readLine());
    }
    public double calculatePerimeter(){
        return 2.0 * PI * radius;
    }
    public double calculateArea(){
        return PI * Math.pow(radius,2);
    }
}
