package com.softserve.edu05.practicaltask2;

public class Line {
    private Point initialPoint;
    private Point endPoint;


    public Point getInitialPoint() {
        return initialPoint;
    }

    public void setInitialPoint(Point initialPoint) {
        this.initialPoint = initialPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
    public Line(){};
    public Line(Point initialPoint, Point endPoint) {
        setInitialPoint(initialPoint);
        setEndPoint(endPoint);
    }

    @Override
    public String toString() {
        return "Line{" +
                "initialPoint=" + initialPoint +
                ", endPoint=" + endPoint +
                '}';
    }
    public String print() {
        return "Line{" +
                "initial" + initialPoint +
                ", end" + endPoint +
                '}';
    }
}
