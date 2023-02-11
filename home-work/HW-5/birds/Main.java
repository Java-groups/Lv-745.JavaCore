package birds;

public class Main {

    public static void main(String[] args) {
        Bird [] birds = {new Chicken("White", true), new Eagle("Brown", true), new Penguin("Black/White", true), new Swallow("Black/White", true)};

        for(Bird i : birds) {
            i.fly();
        }
    }
}
