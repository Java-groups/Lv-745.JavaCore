package practical;

public enum Days {
    Monday("Понеділок", "Monday"),
    Tuesday("Вівторок", "Tuesday"),
    Wednesday("Середа", "Wednesday"),
    Thursday("Четвер", "Thursday"),
    Friday("Пʼятниця", "Friday"),
    Saturday("Субота", "Saturday"),
    Sunday("Неділля", "Sunday");

    private final String ua;
    private final String en;

    Days(String ua, String en){
        this.ua = ua;
        this.en = en;
    }

    public String getUa() {
        return ua;
    }

    public String getEn(){
        return en;
    }
}
