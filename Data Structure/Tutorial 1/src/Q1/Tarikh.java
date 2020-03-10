package Q1;
public class Tarikh {
    private int day,month,year;

    public Tarikh(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public String toString() {
        if(day < 10)
           return "Date is : 0" +day+"/"+month+"/"+year;
        else
             return "Date is : " +day+"/"+month+"/"+year;
    }
}
