package Q1;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Day: ");
        int day = sc.nextInt();
        System.out.print("Month: ");
        int month = sc.nextInt();
        System.out.print("Year: ");
        int year = sc.nextInt();
        
        Tarikh a = new Tarikh(day,month,year);
        System.out.println(a.toString());
    }
}
