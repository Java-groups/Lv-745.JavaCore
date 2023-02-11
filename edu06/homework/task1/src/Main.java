public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Swallow("black", false);
        birds[1] = new Penguin("black and white", false);
        birds[2] = new Chicken("broun", true);
        birds[3] = new Eagle("gray", false);
        for (Bird bird : birds) {
            bird.fly();
            System.out.println(bird);
        }

    }
}