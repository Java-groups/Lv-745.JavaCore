package homeWork8OOP_InterfacesPolymorfizm.homeWork.task2;

public class Liner extends WaterVehicle {
    private int floors;


    public Liner( int passengers){
            super(passengers);
        }

        @Override
        void isSailing () {

        }

        public int getFloors () {
            return floors;
        }
        public void setFloors(int floors){
        this.floors = floors;
        }

    }

