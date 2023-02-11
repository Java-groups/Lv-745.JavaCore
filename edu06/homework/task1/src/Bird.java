public abstract class Bird {
    private String feathers;

    private Boolean layEggs;

    public Bird() {

    }
    public Bird(String feathers, Boolean layEggs) {
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
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }

    abstract void fly();
}
