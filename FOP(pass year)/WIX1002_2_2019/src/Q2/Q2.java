package Q2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the number of bags sold:");
        int numberOfBags = sc.nextInt();
        System.out.print("Enter the weight per bas(kilogram):");
        int unitWeight = sc.nextInt();
        
        double price = 5.99;
        double sales = 0.0725;
        
        double totalPrice = unitWeight*numberOfBags*price;
        double totalPriceWithTax = totalPrice +totalPrice*sales;
        
        System.out.println("");
        System.out.println("Price per kilogram:\t$"+price);
        System.out.printf("Sales tax:\t\t%.2f",(sales*100.0));
        System.out.println("%");
        System.out.printf("Total price:\t\t$%.2f",totalPriceWithTax);
    }
}
