package homeWork8OOP_InterfacesPolymorfizm.homeWork.task2;

public class Boat extends WaterVehicle {

    public int Volume;

    public Boat(int passengers){
        super(passengers);

    }
    public int getVolume(){
        return Volume;
    }
    public void setVolume(int volume){
        Volume = volume;
    }
    @Override
    void isSailing() {

    }
}
