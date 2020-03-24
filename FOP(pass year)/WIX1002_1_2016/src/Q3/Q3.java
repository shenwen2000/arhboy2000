package Q3;
import java.util.Scanner;
public class Q3 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the number of random integer: ");
      int num = sc.nextInt();
      
      int [] ran = new int [num];
      for(int i = 0 ; i<ran.length; i++){
          ran[i] = (int)(Math.random()*1001);
      }
      display(ran);
      System.out.print("\nMaximum Number : "+ maxNum(ran));
      round(ran);
      reverseArr(ran);
  }
   public static void display(int [] arr ){
      System.out.print("The random integer : ");
      for(int i = 0; i<arr.length; i ++){
          System.out.print(arr[i] + " ");
      } 
  }
   public static int maxNum(int[] arr){
      int max = arr[0];
      for(int i = 1; i<arr.length; i ++){
          if(max< arr[i])
              max = arr[i];
      }
      return max;
   }
   public static void round(int [] arr){
     long rounded = 0;
     System.out.print("\nThe approximation of the integer to the nearest tenth : ");
     for(int i = 0; i< arr.length; i++){
             rounded =(Math.round(arr[i]/10.0)*10);
             System.out.print(rounded+ " ");
             rounded = 0;
     } 
   }
   public static void reverseArr(int [] arr){
       System.out.print("\nThe random integer in reverse order: ");
       int temp = 0;
       for(int i = 0; i<arr.length; i++){
           while(arr[i] > 0){
               temp = temp * 10 + arr[i] % 10;
               arr[i] = arr[i]/10;         
     }
           System.out.print(temp + " ");
           temp = 0;
   }
  }
}
