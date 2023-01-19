public class Call {
    private final String country1 = "Ukraine";
    private final String country2 = "Poland";
    private final String country3 = "USA";
    private int time;
    private double units;
    private double count;
    public String getCountry1() {
        units = 3.5;
        return country1;
    }

    public String getCountry2() {
        units = 10;
        return country2;
    }
    public String getCountry3() {
        units = 25;
        return country3;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getCount() {
        count = time * units;
        return count;
    }

}
