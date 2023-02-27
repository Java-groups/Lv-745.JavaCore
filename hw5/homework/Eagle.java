package hw5.homework;

public class Eagle extends FlyingBird{
    private String nameBird;

    @Override
    public String toString() {
        return "Eagle{" +
                "nameBird=' " + nameBird + "  Feather=' "+isFeathers() + "  Lay eggs =' " +isLayEggs()+
                '}';
    }

    public String getNameBird() {
        return nameBird;
    }

    public void setNameBird(String nameBird) {
        this.nameBird = nameBird;
    }

    public Eagle(String feathers, String layEggs, String nameBird) {
        super(feathers, layEggs);
        this.nameBird = nameBird;
    }

}
