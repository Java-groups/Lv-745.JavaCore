package practical2;

import java.awt.*;

public class ColorLine extends Line{
    private Color lineColor;

    public ColorLine(Point startPoint, Point endPoint, Color lineColor) {
        super(startPoint, endPoint);
        this.lineColor = lineColor;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "lineColor=" + lineColor +
                '}';
    }
    public String print() {
        return "ColorLine{ startPoint=" + this.getStartPoint() +
                ", endPoint=" + this.getStartPoint() +
                "lineColor=" + lineColor +
                '}';
    }
}
