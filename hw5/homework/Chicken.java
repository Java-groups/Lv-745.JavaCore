package hw5.homework;

public class Chicken extends NonFlyingBird{
    @Override
    public String toString() {
        return "Chicken{" +
                "nameBird=' " + nameBird + "  Feather=' "+isFeathers() + "  Lay eggs =' " +isLayEggs()+
                '}';
    }

    private String nameBird;

    public String getNameBird() {
        return nameBird;
    }

    public void setNameBird(String nameBird) {
        this.nameBird = nameBird;
    }

    public Chicken(String feathers, String layEggs, String nameBird) {
        super(feathers, layEggs);
        this.nameBird = nameBird;
    }

}
