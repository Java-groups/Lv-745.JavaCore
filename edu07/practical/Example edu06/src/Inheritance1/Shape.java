package Inheritance1;

public class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    double getArea() {
        return 0;
    }


    @Override
    public String toString() {
        return "I'm a shape of " + color + " color";
    }
}
