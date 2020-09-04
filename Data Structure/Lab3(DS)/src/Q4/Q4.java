package Q4;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Q4 {
    public static void main(String[] args){
        
        //Getting the current date
        Date date = new Date();
        //Specifying the format of the date using SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Formatting the date to the specified format
        String dateString = sdf.format(date);
        System.out.println("Today Date(dd/mm/yyyy) : "+dateString);
        System.out.println("Today is on "+ getDayName(index));
        
        pastDate(20,8,2015);
    }
    public static int getDay(){
        // 1 - 7 means Mon to Sun
        Date date = new Date();
        SimpleDateFormat f1 = new SimpleDateFormat("E");
        String day = f1.format(date);
        switch(day){
            case "Mon":
                return 1;
            case "Tue":
                return 2;
            case "Wed":
                return 3;
            case"Thur":
                return 4;
            case "Fri":
                return 5;
            case "Sat":   
                return 6;
            case "Sun":
                return 7;
            default:
                 return -1;   
      }
    }
     static int index = getDay();
     public static boolean checkLeapYear(int year){
          return ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0);
     }
     public static String getDayName(int index){
         switch(index){
             case 1:
                 return "Monday";
             case 2:
                 return "Tuesday";
             case 3:
                 return "Wednesday";
             case 4:
                 return "Thursday";
             case 5:
                 return "Friday";
             case 6:
                 return "Satarday";
             case 7:
                 return "Sunday";
             default:
                 return null;
         }
     }
     public static int getMonthDay(int year, int month) {
        switch (month) {
            case 1:
                return 31;
            case 2:
                if (checkLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
     }
     public static void pastDate(int d, int m, int y,int pD, int pM, int pY){
         if(d == pD && m == pM && y == pY){
                 System.out.println("Search Date (dd/mm/yyyy): "+d
                  +"/"+m+"/"+y);
                 System.out.println("Match");
                 System.out.println("Search Date is on "+getDayName(dif%7));
                 return;        
         }
          else
              if(d >= 1 && m >= 1){
                  dif++;
                  pastDate(d-1,m,y,pD,pM, pY);
              }
              else if(d == 0){
                   d = getMonthDay(y, m-1);
                   m = m -1;
                   dif++;
                   pastDate(d-1,m,y,pD,pM, pY);
              }
              else if(m == 0){
                   m = 12;
                   d = 31;
                   y = y-1;
                   dif++;
                   pastDate(d-1,m,y,pD,pM, pY);
              }
     }
     static int dif = 0;
     public static void pastDate(int day,int mon,int year){
           index = getDay();
           Date date = new Date();
           SimpleDateFormat sdf = new SimpleDateFormat("dd");
           int dayA = Integer.parseInt(sdf.format(date));
           sdf = new SimpleDateFormat("MM");
           int MonthA = Integer.parseInt(sdf.format(date));
           sdf = new SimpleDateFormat("yyyy");
           int yearA = Integer.parseInt(sdf.format(date));
           pastDate(dayA,MonthA,yearA,20,8,2015);
     }
}
