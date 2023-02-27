package hw5.practicalTasks1;

public class sedan extends car {
    public sedan (String model,int maxSpeed,int yearOfManufacture){
        super(model,maxSpeed,yearOfManufacture);
    }

    @Override
    int run() {
        return 3;
    }

    @Override
    int stop() {
        return -5;}





}
