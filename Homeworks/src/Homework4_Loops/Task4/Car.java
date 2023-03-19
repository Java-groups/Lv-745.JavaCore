package Homework4_Loops.Task4;

public class Car {
    String type;
    int prodYear;
    double engineCapacity;

    public Car(String type, int prodYear, double engineCapacity) {
        this.type = type;
        this.prodYear = prodYear;
        this.engineCapacity = engineCapacity;
    }

    public int getProdYear() {
        return prodYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", prodYear=" + prodYear +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
