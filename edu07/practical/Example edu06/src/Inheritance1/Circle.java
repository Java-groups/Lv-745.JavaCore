package Inheritance1;

public class Circle  extends Shape {
    int radius;
    public Circle(int radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }


    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
