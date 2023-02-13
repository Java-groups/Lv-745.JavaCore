package homework2;

public class Bus extends GroundVehicle{
    private String route;
    public Bus(){}

    public Bus(String route, int passengers) {
        this.route = route;
        this.setPassengers(passengers);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("Bus is driving on route: "+this.route+ "; Passengers: "+this.getPassengers());
    }
}
