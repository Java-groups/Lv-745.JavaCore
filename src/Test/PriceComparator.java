package Test;

import java.util.Comparator;

public class PriceComparator implements Comparable<House>, Comparator<House> {


    public int compareTo(House h1, House h2) {
        if (h1.getPrice() == h2.getPrice()){
            return 0;
        }if (h1.getPrice() > h2.getPrice()){
            return 1;
        }else {
            return -1;
        }

    }


    @Override
    public int compareTo(House o) {
        return 0;
    }

    @Override
    public int compare(House o1, House o2) {
        return 0;
    }
}
