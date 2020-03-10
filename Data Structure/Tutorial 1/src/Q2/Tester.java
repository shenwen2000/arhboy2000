package Q2;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("The sentence is : ");
       String sentence =sc.nextLine();
       
       Sentence a = new Sentence(sentence);
       System.out.println(a);
 }
}