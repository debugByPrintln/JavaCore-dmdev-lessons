package lessons.lesson17_1;

public enum WeekDays {
    MONDAY("2001-01-01"),
    TUESDAY("2001-01-02"),
    WEDNESDAY("2001-01-03"),
    THURSDAY("2001-01-04"),
    FRIDAY("2001-01-05"),
    SATURDAY("2001-01-06"),
    SUNDAY("2001-01-07");

    private String date;

    WeekDays(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }
}
