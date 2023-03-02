package nestedClass;

public class ElectroCar {
    private int id;

    private class Motor{
        public void startMotor(){
            System.out.println("motor is starting");
        }
    }
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging");
        }
    }

    public ElectroCar (int id){
        this.id = id;
    }
    public void start(){
        System.out.println("Electrocar" + id +"is starting");

    }
}
