package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть радіус: ");
        int radius = Integer.parseInt(rd.readLine());
        double area = Math.PI * (radius * radius);
        System.out.println("Площина кругу " + area);
        double circumference = Math.PI * 2*radius;
        System.out.println("Довжина кола рівна :" + circumference);

    }


}
