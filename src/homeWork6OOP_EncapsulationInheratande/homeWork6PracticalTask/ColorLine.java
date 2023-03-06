package homeWork6OOP_EncapsulationInheratande.homeWork6PracticalTask;
import java.awt.Color;
public class ColorLine extends Line{
    Color color;
    public ColorLine(Point p1, Point p2, Color color) {
        super(p1, p2);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color=" + color +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
