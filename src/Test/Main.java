package Test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<House> myHouseArrayList = new ArrayList<House>();
        House firstHouse = new House(100, 12222, "tokyo", true);
        House secondtHouse = new House(200, 134222, "lviv", true);
        House thirdHouse = new House(300, 55522, "ternopil", true);

        myHouseArrayList.add(firstHouse);
        myHouseArrayList.add(secondtHouse);
        myHouseArrayList.add(thirdHouse);

        for (House h : myHouseArrayList) {
            System.out.println(h);

            {
                System.out.println(h);
            }
        }
    }

}