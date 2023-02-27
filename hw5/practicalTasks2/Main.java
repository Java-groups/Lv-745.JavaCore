package hw5.practicalTasks2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Line[] newLine = {
                new Line(new Point(15,22),new Point(35,12)),
                new Line(new Point(62,36),new Point(9,17)),
                new ColorLine (new Point(44,87),new Point(44,87),new Color(12, 15, 6)),
                new ColorLine (new Point(91,3),new Point(12,54),new Color(222, 17, 94))
        };

for(Line lines :newLine ){
    System.out.println(lines);
}









    }





}
