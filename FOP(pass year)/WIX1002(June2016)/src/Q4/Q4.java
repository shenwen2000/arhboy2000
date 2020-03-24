package Q4;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the valuue of n for a regular polygon,n:");
        int n = sc.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon(in meter),s:");
        int s = sc.nextInt();
        System.out.printf("The area is:%.2f squared meters",area(n,s));
    }public static double area(int n, double s){
        double degree = Math.tan(Math.toRadians(180/n));
        double area = (n*(Math.pow(s, 2))/(4*degree));
        return area;
    }
}
