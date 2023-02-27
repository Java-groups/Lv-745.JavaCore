package hw5.homework;

public abstract class Bird {
    private String feathers ;
    private String  layEggs;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
   abstract void fly();

    public String isFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    public String toString() {
        return "Bird {" +
                "feathers = '" + feathers  +'\''+ "layEggs = "+layEggs+
                '}';
    }
}
