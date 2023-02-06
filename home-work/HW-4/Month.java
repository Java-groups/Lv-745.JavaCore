public class Month {

    private int month;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Month(int month) {
        this.month = month;
    }

    public String output() {

        return switch(month) {
            case 1 -> MonthEnum.JANUARY.getMonth();
            case 2 -> MonthEnum.FEBRUARY.getMonth();
            case 3 -> MonthEnum.MARCH.getMonth();
            case 4 -> MonthEnum.APRIL.getMonth();
            case 5 -> MonthEnum.MAY.getMonth();
            case 6 -> MonthEnum.JUNE.getMonth();
            case 7 -> MonthEnum.JULY.getMonth();
            case 8 -> MonthEnum.AUGUST.getMonth();
            case 9 -> MonthEnum.SEPTEMBER.getMonth();
            case 10 -> MonthEnum.OCTOBER.getMonth();
            case 11 -> MonthEnum.NOVEMBER.getMonth();
            case 12 -> MonthEnum.DECEMBER.getMonth();
            default -> "Wrong month";
        };
    }

}
