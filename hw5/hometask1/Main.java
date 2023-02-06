package hometask1;

public class Main {
    public static void main(String[] args) {
        Bird [] birds = new Bird[4];
        birds[0] = new Eagle("green and white",false);
        birds[1] = new Swallow("black and white",false);
        birds[2] = new Penguin("black and white",false);
        birds[3] = new Chicken("variegated",true);
        for (Bird bird:birds) {
            bird.fly();
            System.out.println(bird);
        }
    }
}
