package homeWork7OOP_InterfacesPolymorfizm.homeWork.task2;

public class Car extends GroundVihicle{

    private String model;

    public Car(int passengers) {
        super(passengers);
    }
    public String getModel(){
        return model;

    }
    public void setModel (String model){
        this.model = model;
    }

    @Override
    void drive() {

    }
}
