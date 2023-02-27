package hw5.practicalTasks2;

public class Line{

    private Point startline;
    private Point finishline;

    public Line(Point startline, Point finishline) {
        this.startline = startline;
        this.finishline = finishline;
    }


    @Override


    public String toString() {
        return "Line {" +
                "startline = '" + startline + '\'' +
                ", finishline =" + finishline +
                '}';
    }

    void print (){
        System.out.println("startline = "+ startline + '\'' +
                "finishline =" + finishline);
    }


    public Point getFinishline() {
        return finishline;
    }

    public void setFinishline(Point finishline) {
        this.finishline = finishline;
    }

    public Point getStartline() {
        return startline;
    }

    public void setStartline(Point startline) {
        this.startline = startline;
    }
}
