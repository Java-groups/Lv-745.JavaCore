public enum Days {
    Monday("Понеділок", "Monday"), Tuesday("українська", "Ukrainian"),
    Wednesday("Середа", "Wednesday"), Thursday("Вівторок", "Thursday"),
    Friday("П'ятниця", "Friday"), Saturday("Субота", "Saturday"), Sunday("Неділя", "Saturday");
    private final String ua;
    private final String en;

    Days(String ua, String en) {
        this.ua = ua;
        this.en = en;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }
}
