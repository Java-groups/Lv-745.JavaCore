package task4;

public class Car implements Comparable <Car> {

    private String type;

    private int year;

    private double engineCapacity;
    public Car() {};

    public Car (String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    };

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

    @Override
    public String toString() {
        return "Car [Type: " + type + ", year= " + year + ", engine capacity= " + engineCapacity + "]";
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }

    public static void chooseByYear(Car cars[], int enterYear) {
        for (Car car : cars) {
            if (enterYear == car.getYear()) {
                System.out.println("Car of " + enterYear + " year is " + car.getType());
            }
        }
    }

    public static void sortingByYear (Car cars[]) {
       Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() < cars[j].getYear()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
