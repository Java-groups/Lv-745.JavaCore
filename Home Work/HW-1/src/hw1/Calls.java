package hw1;

public class Calls {
    private int c1;
    private int c2;
    private int c3;

    private int t1;
    private int t2;
    private int t3;


    public Calls(int c1, int c2, int c3, int t1, int t2, int t3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public void output() {
        System.out.println("First country calls: " + (c1 * t1));
        System.out.println("First country calls: " + (c2 * t2));
        System.out.println("First country calls: " + (c3 * t3));
    }
}
