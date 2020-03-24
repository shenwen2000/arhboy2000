package Q2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the initial tuition fee(i.e year 1):");
        double tuitionFee = sc.nextDouble();
        System.out.print("Enter the yearly rate of increment(e.g enter 5.2 for 5.2%):");
        double rate = sc.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = sc.nextInt(); 
        System.out.printf("Computed tuition fee for year%d is: %.2f ",year,computeFee(tuitionFee,rate,year));
    }
    public static double computeFee(double tuitionFee, double rate , int year){
        while(year>1){
            tuitionFee = tuitionFee*((rate+100)/100);
            year--;
        }
        return tuitionFee;
    }
}
