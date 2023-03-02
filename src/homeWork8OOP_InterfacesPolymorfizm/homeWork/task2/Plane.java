package homeWork8OOP_InterfacesPolymorfizm.homeWork.task2;

public class Plane extends FlyingVehicle{


    public int maxDistance;

    public Plane(int passengers){
        super(passengers);
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }

   public int getMaxDistance(){
        return maxDistance;
   }
   public void setMaxDistance(){
        this.maxDistance = maxDistance;
   }
}
