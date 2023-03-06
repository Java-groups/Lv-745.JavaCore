package homeWork6OOP_EncapsulationInheratande.homeWork;

public class Test {
    public static void main(String[] args) {
        Bird birds[] = new Bird[4];
        birds[0] = new Eagle(" black and white ",true);
        birds[1] = new Swallow(" pink ",true);
        birds[2] = new Chicken(" white and brown ",true);
        birds[3] = new Penguin(" black and white ",true);
        for (Bird bird:birds){
            bird.fly();
            System.out.println(bird);
        }

    }

}
