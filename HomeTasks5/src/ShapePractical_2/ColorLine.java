package ShapePractical_2;

public class ColorLine extends Line{
    private final String color;

    public ColorLine(Point p1, Point p2, String color) {
        super(p1, p2);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " colorLine -- [ " + color + " ]";
    }
}
