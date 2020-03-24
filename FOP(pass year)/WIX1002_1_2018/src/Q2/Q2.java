package Q2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int AAA =0, AA=0,A=0;
        System.out.print("Enter N number:");
        int num = sc.nextInt();
        
        int[] arr1 = new int[num];
        
        System.out.print("The random numbers are:");
        for(int i =0; i< arr1.length ; i++){
            int ran = (int)(50+Math.random()*101);
            arr1[i] = ran;
            System.out.print(ran + " ");
        }
        for(int i =0; i<arr1.length; i++){
            if(arr1[i] %10 >=0 && arr1[i]%10 <=3 )
                AAA++;
            else if(arr1[i]%10 >= 4 && arr1[i] % 10 <= 6)
                AA++;
            else if(arr1[i]%10 >= 7 && arr1[i] % 10 <= 9)
                A++;
        }
        System.out.println("\nGroup AAA:"+AAA);
        System.out.println("Group AA:"+AA);
        System.out.println("Group A:"+A);
    } 
}
