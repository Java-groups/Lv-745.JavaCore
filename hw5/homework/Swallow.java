package hw5.homework;

public class Swallow extends FlyingBird {
    private String nameBird;

    @Override
    public String toString() {
        return "Swallow{" +
                "nameBird='" + nameBird + "  Feather=' "+isFeathers() + "  Lay eggs =' " +isLayEggs()+
                '}';
    }

    public String getNameBird() {
        return nameBird;
    }

    public void setNameBird(String nameBird) {
        this.nameBird = nameBird;
    }

    public Swallow(String feathers, String layEggs, String nameBird) {
        super(feathers, layEggs);
        this.nameBird = nameBird;
    }
}
