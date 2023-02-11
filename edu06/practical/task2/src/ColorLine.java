import java.awt.*;

public class ColorLine extends Line {
    private Color colorOfLine;

    public ColorLine(Point firstPoint, Point secondPoint, Color colorOfLine) {
        super(firstPoint, secondPoint);
        this.colorOfLine = colorOfLine;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "colorOfLine=" + colorOfLine +
                '}';
    }
    public String print() {
        return "ColorLine{" +
                "colorOfLine=" + colorOfLine +
                '}';
    }

    public Color getColorOfLine() {
        return colorOfLine;
    }

    public void setColorOfLine(Color colorOfLine) {
        this.colorOfLine = colorOfLine;
    }

}
