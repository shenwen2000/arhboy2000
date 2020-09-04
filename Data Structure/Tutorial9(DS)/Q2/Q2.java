package Q2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int key1,key2, count;
        boolean isFound = false;
        
        Q1.SearchTest<Integer> a = new Q1.SearchTest<>(1,1,10);
        
        do{
            System.out.print("The Integer data set are : ");
            a.selectionSort(a.ASCENDING);
            a.showValue();
            System.out.println("Binary Search");
            System.out.print("Enter a number to search: ");
            key1 = sc.nextInt();
            if(a.binarySearch(key1))
                System.out.println(key1+ " is found");
            else
                System.out.println(key1 + " is not found");
        
            System.out.print("Enter two numbers to search (begin end) : ");
            key1 = sc.nextInt();
            key2 = sc.nextInt();
            if(a.binarySeachInRange(key1, key2)){
                System.out.println("The integer can be found in between "+key1 +" and "+key2);
                isFound = true;
            }
            else
                System.out.println("No integer can be found in between "+key1 + " and "+key2);
        }while(!isFound);
    }
}
