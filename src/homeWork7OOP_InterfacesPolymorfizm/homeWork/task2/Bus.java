package homeWork7OOP_InterfacesPolymorfizm.homeWork.task2;

public class Bus extends GroundVihicle{
    private String route;

    public Bus(int passengers) {
        super(passengers);
    }

    @Override
    void drive() {

    }
    public String getRoute(){
        return route;
    }
    public void setRoute(String route){
        this.route = route;
    }
}
