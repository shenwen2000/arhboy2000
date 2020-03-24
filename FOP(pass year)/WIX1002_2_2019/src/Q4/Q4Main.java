package Q4;
import java.util.Scanner;
public class Q4Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        Pizza a = new Pizza();
        a.setSize("Small");
        a.setNumOfBeefTopping(2);
        a.setNumOfCheeseTopping(2);
        a.setNumOfChickenTopping(2);
        a.display();
    }
}
