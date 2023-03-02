package homeWork8OOP_InterfacesPolymorfizm.homeWork.task2;

public class Motorcycle extends  GroundVihicle{

    private int maxSpeed;


    public Motorcycle(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {

    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setModel (int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
}
