package com.softserve.edu05.practicaltask2;

import java.awt.Color;

public class ColorLine extends Line{
    private Color lineColor;

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    public ColorLine(){}
    public ColorLine(Point initialPoint, Point endPoint, Color lineColor) {
        super(initialPoint, endPoint);
        setLineColor(lineColor);
    }
    @Override
    public String toString() {
        return "ColorLine{" +
                "lineColor=" + lineColor +
                '}';
    }
    public String print() {
        return "ColorLine{" +
                "initial" + getInitialPoint() +
                ", end" + getEndPoint() +
                "lineColor=" + lineColor +
                '}';
    }
}
