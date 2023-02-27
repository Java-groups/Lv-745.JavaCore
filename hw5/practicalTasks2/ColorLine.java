package hw5.practicalTasks2;

import java.awt.*;

public class ColorLine extends Line{
    private Color color;
    public ColorLine(Point startline,Point finishline,Color color){
        super(startline,finishline);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public String toString() {
        return "ColorLine {" +
                "Color = '" + color  +
                '}';
    }

    void print (){
        System.out.println("Color = "+ color);
}}
