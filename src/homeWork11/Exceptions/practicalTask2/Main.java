package homeWork11.Exceptions.practicalTask2;

public class Main{
    public static void main(String[] args) throws InterruptedException{
        aboutPlant();
    }



        private static void aboutPlant (){


            Plant plants[] = new Plant[5];
            try {
                plants[0] = new Plant(10, "RED", "FLOWER");
                plants[1] = new Plant(5, "PURPLE", "FLOWER");
                plants[2] = new Plant(20, "YELLOW", "TREE");
                plants[3] = new Plant(19, "BLUE", "BRUSH");
                plants[4] = new Plant(100, "PINK", "TREE");
            } catch (ColorException exception) {
                System.err.println("Error creating  " + exception.getMessage());
            } catch (TypeException e) {
                System.err.println("Error creating plant" + e.getMessage());
            }

            for (Plant plant : plants) {
                System.out.println(plant);
            }
        }
    }

