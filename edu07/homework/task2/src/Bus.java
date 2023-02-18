public class Bus extends GroundVehicle{
    private String route;

    public Bus(String route) {}

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }


    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("The route of bus: " + this.route + ". Passengers - " + this.getPassengers() + " people.");
    }
}
