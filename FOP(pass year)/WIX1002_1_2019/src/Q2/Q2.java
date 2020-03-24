package Q2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N : ");
        int num = sc.nextInt();
        
        int [][] matrixA = new int [num][num];
        int [][] matrixB = new int [num][num];
        int [][] matrixAdd = new int [num][num];
        int [][] matrixMul = new int [num][num];
        generateMatrix(matrixA,matrixB);
        displayMatrix(matrixA,matrixB);
        addTwoMatrices(matrixA,matrixB,matrixAdd);
         mulTwoMatrices(matrixA,matrixB,matrixMul);
        }
    public static void generateMatrix(int[][] matrixA, int[][] matrixB){
        for(int i =0; i< matrixA.length; i++){
            for(int j =0; j< matrixA[i].length; j++){
                matrixA[i][j] = (int)(Math.random()*10);
        }
    }
         for(int i =0; i< matrixB.length; i++){
            for(int j =0; j< matrixB[i].length; j++){
                matrixB[i][j] = (int)(Math.random()*10);
        }
    }
  }
    public static void displayMatrix(int[][] matrixA, int[][] matrixB){
        System.out.println("Matrix A");
        for(int i =0; i< matrixA.length; i++){
            for(int j =0; j< matrixA[i].length; j++){
                System.out.print(matrixA[i][j]+" ");
        }
            System.out.println();
    }
        System.out.println("Matrix B");
        for(int i =0; i< matrixB.length; i++){
            for(int j =0; j< matrixB[i].length; j++){
                System.out.print(matrixB[i][j]+" ");
        }
            System.out.println();
    }
 }
    public static void addTwoMatrices(int[][] matrixA, int[][] matrixB,int [][] matrixAdd){
       for(int i =0; i< matrixA.length; i++){
           for(int j = 0; j < matrixA[i].length;j++){
               matrixAdd[i][j] = matrixA[i][j]+ matrixB[i][j];
           }
       }
       System.out.println("Matrix A + B");
        for(int i =0; i< matrixA.length; i++){
           for(int j = 0; j < matrixA[i].length;j++){
               System.out.print(matrixAdd[i][j]+" ");
           }
           System.out.println();
       }
   } 
    public static void mulTwoMatrices(int[][] matrixA, int[][] matrixB,int [][] matrixMul){
        for(int i =0; i< matrixA.length; i++){
           for(int j = 0; j < matrixA[i].length;j++){
               matrixMul[i][j] = matrixA[i][j]* matrixB[i][j];
           }
       }
       System.out.println("Matrix A X B");
        for(int i =0; i< matrixA.length; i++){
           for(int j = 0; j < matrixA[i].length;j++){
               System.out.print(matrixMul[i][j]+" ");
           }
           System.out.println();
       }
    }
}

