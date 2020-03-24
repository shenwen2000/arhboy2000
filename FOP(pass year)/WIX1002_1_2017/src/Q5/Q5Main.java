package Q5;
import java.util.Scanner;
public class Q5Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the marks for Grammar(maximum 30 marks):");
    int marksG = sc.nextInt();
    System.out.print("Enter the marks for spelling(maximum 20 marks):");
    int marksS = sc.nextInt();
    System.out.print("Enter the marks for Length(maximum 20 marks):");
    int marksL = sc.nextInt();
    System.out.print("Enter the marks for Content(maximum 30 marks);");
    int marksC = sc.nextInt();
    
    Essay a = new Essay(marksG,marksS,marksL,marksC);
    a.setScore(marksG+marksS+marksL+marksC);
    System.out.println(a.toString());
 }
}
