package homework;

public class Car {
    private String type;
    private int year;
    private double capacity;

    public Car(String type, int year, double capacity) {
        this.type = type;
        this.year = year;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                '}';
    }
}
