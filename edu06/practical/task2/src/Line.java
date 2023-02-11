public class Line {
    private Point firstPoint;

    private Point secondPoint;

    public Line (Point firstPoint, Point secondPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    @Override
    public String toString() {
        return "Line{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                '}';
    }
    public String print() {
        return "Line{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                '}';
    }

    public Point getFirstPoint() {
        return firstPoint;
    }
    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }
    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }
}
