package hw5.homework;

public class Penguin extends NonFlyingBird{

    private String nameBird;
    public Penguin(String feathers, String layEggs, String nameBird) {
        super(feathers, layEggs);
        this.nameBird = nameBird;
    }


    public String getNameBird() {
        return nameBird;
    }

    public void setNameBird(String nameBird) {
        this.nameBird = nameBird;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "nameBird=' " + nameBird + "  Feather=' "+isFeathers() + "  Lay eggs =' " +isLayEggs()+
                '}';
    }
}
