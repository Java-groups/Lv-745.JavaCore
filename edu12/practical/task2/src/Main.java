public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        Plant[] plants = new Plant[5];
        try {
            plants[0] = new Plant(10, Color.Red, Tyype.Flower);
            plants[1] = new Plant(20, Color.Blue, Tyype.Tree);
            plants[2] = new Plant(30, Color.Green, Tyype.Shrub);
            plants[3] = new Plant(40, Color.Yellow, Tyype.Flower);
            plants[4] = new Plant(50, Color.Black, Tyype.Flower);
        } catch (ColorException e) {
            System.out.println("Caught a ColorException: " + e.getMessage());
        } catch (TypeException e) {
            System.out.println("Caught a TypeException: " + e.getMessage());
        }

        for (Plant plant : plants) {
            if (plant != null) {
                System.out.println(plant);
            }
        }

    }
}