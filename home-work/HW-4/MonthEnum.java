public enum MonthEnum {

    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("Desember");

    private final String month;
    MonthEnum(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }
}
