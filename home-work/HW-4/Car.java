import java.util.ArrayList;

public class Car {
    private String vendor;
    private String model;
    private double engineCapacity;
    private int yearOfProduction;

    public Car(String vendor, String model, double engineCapacity, int yearOfProduction) {
        this.vendor = vendor;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOfProduction;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

}
