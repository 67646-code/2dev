import java.time.Year;

public class MyDate {
int day = this.day;
int month = this.month;
int year = this.year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year= year;
    }

    public boolean isLenient(){
        return Year.isLeap(this.year);
    }
}
