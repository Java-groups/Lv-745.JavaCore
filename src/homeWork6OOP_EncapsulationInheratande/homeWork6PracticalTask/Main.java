package homeWork6OOP_EncapsulationInheratande.homeWork6PracticalTask;
import java.awt.Color;
public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[3];
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(10, 10);
        lines[0] = new Line(p1, p2);
        lines[1] = new ColorLine(p2, p3, Color.RED);
        lines[2] = new Line(p3, p1);
        for (Line line : lines) {
            line.print();

        }
    }
}
