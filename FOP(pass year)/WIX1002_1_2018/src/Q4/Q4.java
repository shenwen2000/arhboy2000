package Q4;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class Q4 {
    public static void main(String [] args){
        try{
        Scanner sc = new Scanner(new FileInputStream("Q4.txt"));
        String [] all;
        double [] marks = new double[5];
        String temp = "";
        String name = "";
        int degree;
        double sum = 0;
        while(sc.hasNextLine()){
           temp = sc.nextLine();
           all = temp.split(",");
           degree =Integer.parseInt(all[6]);
           name = all[0];
           
           for(int i = 1; i<all.length-2;i++){
             marks[i] = Double.parseDouble(all[i]);
           }
           for(int i = 0; i< marks.length-1;i++){
               for(int j = 0; j< marks.length-1; j++){
                   if(marks[i]> marks[i+1]){
                       double hold = marks[i];
                       marks[i]=marks[i+1];
                       marks [i+1]= hold;
                   }
               }
           }
           for(int i =1; i<marks.length-1;i++){
               sum += marks[i];
        }
           System.out.println(name+" score "+ sum);
        }
         sc.close();
    }catch(FileNotFoundException e){
        System.out.println("File was not found");
    }
  }
}