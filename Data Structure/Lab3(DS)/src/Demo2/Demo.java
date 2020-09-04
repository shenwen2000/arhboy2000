package Demo2;
import java.text.SimpleDateFormat;
import java.util.*;
public class Demo {
    final static String[] days = new String[] {"Sunday", "Monday", " Tuesday","Wednesday","Thursday","Friday","Saturday"};
    final static int[] leapYearMonths = new int[] {0,31,29,31,30,31,30,31,31,30,31,30,31};
    final static int[] nonleapYearMonths = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
    
    public static String getDayByCalendar(Calendar cal){
        return days[cal.get(Calendar.DAY_OF_WEEK)-1];
    }
    
    public static boolean isLeap(int n){
        return(n % 400 == 0 || (n % 100 != 0 && n % 4 == 0));
    }
    
    public static void printDate(int y , int m, int d, int d_y, int d_m, int d_d, int day){
        //if same date,print today's day
        if(y == d_y && m == d_m && d == d_d){
            System.out.println("Search Date is on "+days[day]);
            return;
        }
    
    //set previous date
    int prevDayIndex = day -1 == -1 ? 6 : day-1;
    int prevDay = d_d-1;
    if(prevDay > 0){
       printDate(y, m, d, d_y, d_m, prevDay, prevDayIndex);
       return;
}
    
    //else, set previous month
    int prevMonth = d_m -1;
    //set if prevMonth is more than 0
    if(prevMonth > 0){
        prevDay = isLeap(d_y)? leapYearMonths[prevMonth]:nonleapYearMonths[prevMonth];
        printDate(y,m,d,d_y,prevMonth,prevDay,prevDayIndex);
        return;
     }
    //else , set previous year
    int prevYear = d_y-1;
    //set prevMonth and [revDay
    prevMonth = 12;
    prevDay = isLeap(prevYear)? leapYearMonths[prevMonth]:nonleapYearMonths[prevMonth];
    printDate(y,m,d,prevYear,prevMonth,prevDay, prevDayIndex);
    } 
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        
        Date today = new Date();
        cal.setTime(today);
        String todayStr = sdf.format(today);
        System.out.println("Today Date(dd/mm/yyyy): "+todayStr);
        System.out.println("Today is on "+ getDayByCalendar(cal));
        
        System.out.print("Search Date(dd/mm/yyy): ");
        Scanner scanner = new Scanner(System.in);
        String searchStr = scanner.nextLine();
        printDate(Integer.parseInt(searchStr.substring(6)),Integer.parseInt(searchStr.substring(6)),
                  Integer.parseInt(searchStr.substring(0,2)),Integer.parseInt(todayStr.substring(6)),
                  Integer.parseInt(todayStr.substring(3,5)),Integer.parseInt(todayStr.substring(0,2)),
                  cal.get(Calendar.DAY_OF_WEEK) -1);
           scanner.close();       
    }
}
