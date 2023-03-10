package com.softserve.edu05.hwtask1;

public abstract class Bird {
    private Boolean feathers;
    private Boolean layEggs;

    abstract void fly();

    public Boolean getFeathers() {
        return feathers;
    }

    public void setFeathers(Boolean feathers) {
        this.feathers = feathers;
    }

    public Boolean getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(Boolean layEggs) {
        this.layEggs = layEggs;
    }

    public Bird() {}

    public Bird(Boolean feathers, Boolean layEggs) {
        setFeathers(feathers);
        setLayEggs(layEggs);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }
}

