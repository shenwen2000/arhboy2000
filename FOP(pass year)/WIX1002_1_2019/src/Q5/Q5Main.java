package Q5;
import java.util.Scanner;
public class Q5Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        SpecialDelivery a = new SpecialDelivery(false,false,"Ali","Ahmad",4.4);
        SpecialDelivery b = new SpecialDelivery(false,false,"Ah Chong","Fatimah",63.1);
        SpecialDelivery c = new SpecialDelivery(true,false,"FSKTM,UM","FK,UM",4.4); 
        SpecialDelivery d = new SpecialDelivery(true,true,"Ang","Liew",4.4);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
         
    }
}
