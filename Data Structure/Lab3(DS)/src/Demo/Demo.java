/*
package Demo;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
public class Demo {
    public static void main(String[] args){
        System.out.println("Mesh Topology");
        System.out.println("There are 4 switches in the ");
        System.out.println("The total number of");
        System.out.println("Mesh Topology");
        System.out.println("There are 4 switches in the ");
        System.out.println("The total number of");
        Scanner in = new Scanner(new FileInputStream("Q3.txt"));
        PrintWriter out = new PrintWriter(new);
        readAndWriteFile(in,out);
        out.close();
        //Q3
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements");
        int num = in.nextInt();
        int[] arr = new int[num];
        generateArray(arr);
        System.out.println("The number is");
        printArray(arr);
        permuteIntegerArray(arr,num);
    }
    private static void generateArray(int[] arr){
        Random rand = new Random();
        for(int i = 0 ; i< arr.length; i++){
            arr[i] = rand.nextInt(10);
        }
    }
    private static void printArray(int[] arr){
        String number = "";
        for(int i = 0; i < arr.length; i++){
            number += arr[i];
        }
        System.out.println(Integer.parseInt(number));
    }
    
    public static void permuteIntegerArray(int[] arr,int count){
        if(count == 0){
            printArray(arr);
            return;
        }
        else{
            for(int i = 0;i <= count; i++){
                swap(arr,i,count-1);
                permuteIntegerArray(arr,count-1);
                swap(arr,i,count-1);
            }
        }
    }
    
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static int findMeshTopoly(int i ){
        if(i < 0){
            return 0;
        }
        else{
            return i + findMeshTopoly(i-1);
        }
    }
    public static void readAndWriteFile(Scanner in,){
        
    }
}
*/