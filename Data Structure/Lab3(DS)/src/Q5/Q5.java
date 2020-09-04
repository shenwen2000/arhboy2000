package Q5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Q5 extends Exception {
  static int index = 0;
  public static void main(String[] args){
      int [] arr = new int[5];
      while(index < 6){
          getInput(arr);
      } 
      System.out.println("The array of integers is:");
      for(int i = 0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
      }
 }
  public static void getInput(int[] arr){
      Scanner sc = new Scanner(System.in);
      try{
         for(int i = index; i < arr.length; i++){
             System.out.print("Enter an Integer: ");
             arr[i] = sc.nextInt();
             index++; 
      }
         sc.close();
    }
      catch(InputMismatchException ex){
          System.out.println("Invalid input type");
      }
      catch(ArrayIndexOutOfBoundsException ex){
              System.out.print("");
      }
  }
}
