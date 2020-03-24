package Q5;
import java.util.Scanner;
public class Q5Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter values for a,b and c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        QuadraticEquation e = new QuadraticEquation(a,b,c);
                
        System.out.println("The equation is: "+a+"x"+"(^2)"+"+"+"("+b+")"+"x"+"+"+"(-"
                +c+")");
        System.out.println("Discriminant:"+e.Discriminant());
        if(e.Discriminant()<0){
            System.out.println("The eqaution has no roots");
        }
        else if(e.Discriminant()>0){
            System.out.println("The roots:"+e.calcRoot1()+"and"+e.calcRoot2());
        }
        else
            System.out.println("Same roots:"+e.calcRoot1());
    }
}
