import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Line lines[] = new Line[5];
        lines[0] = new Line(new Point(4, 5.5), new Point(1, 2.2));
        lines[1] = new Line(new Point(1.3, 4.4), new Point(2.5, 1.8));
        lines[2] = new ColorLine(new Point(6.8, 4.5), new Point(7.8, 3.3), new Color(69, 129, 178));
        lines[3] = new ColorLine(new Point(7.6, 5.5), new Point(2.2, 1.2), new Color(151, 43, 175));
        lines[4] = new ColorLine(new Point(4.4, 1.2), new Point(5.6, 8.7), new Color(180, 159, 46));

        for (Line line : lines) {
            System.out.println(line.print());
        }
    }
}