package Q3;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int number1, number2;
        String repeat = "y";
        
        while(repeat.equalsIgnoreCase("y")){
            number1 = (int)(1+Math.random()*10);
            number2 = (int)(1+Math.random()*10);
            System.out.print("What is"+number1+"+"+number2+"?");
            int ans = sc.nextInt();
            if((number1+number2)== ans){
                System.out.println(number1+"+"+number2+"="+ans+"is true");
            }
            else if((number1+number2)!= ans){
                System.out.println(number1+"+"+number2+"="+ans+"is false");
            }
            System.out.print("Do you want to try another question (y/n)?:");
            repeat = sc.next();
        }
        System.out.println("Program ends");
    }
}
