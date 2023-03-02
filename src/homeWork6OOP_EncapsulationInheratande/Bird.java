package homeWork6OOP_EncapsulationInheratande;

public abstract class  Bird {
    private String feathers;

    private Boolean layEggs;
    abstract void fly();
public Bird(){

}
    public Bird (String feathers, Boolean layEggs){
    this.feathers = feathers;
    this.layEggs = layEggs;

    }
    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public Boolean getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(Boolean layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "homeWork6OOP_EncapsulationInheratande " + " feathers" + feathers + " " +
                " lay Eggs " + layEggs + " " + " ";
    }
}

