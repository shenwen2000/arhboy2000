package Q1;
import java.util.Collections;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        for(int i = 0; i<10 ;i++){
            arr[i] =(int)(Math.random()*51);
        }
         for(int i = 0; i<10 ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSmallest number : " + smallestNum(arr,arr.length));
        System.out.println("Sum: "+ sum(arr,arr.length));
        System.out.println("gcd of 50 and 5 are: "+gcd(50,5));
        int dec = (int)(50+Math.random()*51);
        System.out.println(dec);
        System.out.println("After convert : "+convert(dec));
        int n = (int)(1+Math.random()*10);
        System.out.println("N : "+n);
        System.out.println("Sum of the first n cubes: "+ compute(n,3));
    }
    public static int smallestNum(int [] arr,int size){
         if(size == 1){
             return arr[0];
         }
         else
             return Math.min(arr[size-1],smallestNum(arr,size-1));
    }
    public static int sum(int [] arr, int size){
        if(size <= 0)
            return 0;
        else
          return(arr[size-1]+sum(arr,size-1));
    }
    public static int gcd(int x , int y){
        if(y == 0){
            return x;
        }
        else
            return gcd(y,x%y);
    }
    public static int convert(int num){
        if(num<1){
            return 0;
        }
        else
            return(num % 2 + 10 * convert(num/2));
    }
    public static int compute(int num,int power){
        if(num == 0){
            return 0;
        }
         return ((int)Math.pow(num, power)+compute(num-1,power));    
     }
}

