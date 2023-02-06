package practical2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Line [] lines = new Line[4];
        lines[0] = new Line(new Point(2,3), new Point(9,15));
        lines[1] = new Line(new Point(1,1), new Point(10,10));
        lines[2] = new ColorLine(new Point(1,1), new Point(10,10),new Color(123,120,40));
        lines[3] = new ColorLine(new Point(2,2), new Point(12,12),new Color(13,50,20));
        for (Line line : lines) {
            System.out.println(line.print());
        }
    }
}
