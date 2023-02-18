package Inheritance1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5, "red");
        shapes[1] = new Circle(7, "black");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.println(shapes[i].getArea());
            System.out.println();
        }
    }
}