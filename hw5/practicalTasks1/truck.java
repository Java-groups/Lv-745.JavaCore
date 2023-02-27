package hw5.practicalTasks1;

public class truck extends car {

    public truck (String model,int maxSpeed,int yearOfManufacture){
        super(model,maxSpeed,yearOfManufacture);
    }

    @Override
    int run() {
        return 15;
    }

    @Override
    int stop() {
        return 20;
    }
}
