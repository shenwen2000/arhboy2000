package Q3;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class Q3 {
     public static void main(String[] args){
         
         try{
             Scanner sc = new Scanner(new FileInputStream("student.txt"));
             String [] names = new String[10];
             double [] marks = new double [10];
             String [] read;
             String temp;
             int i = 0;
             int absent = 0;
             while(sc.hasNextLine()){
                 temp = sc.nextLine();
                 read = temp.split(",");
                 names [i] = read[0];
                 marks [i] = Double.parseDouble(read[1]);
                 i++;
             }
           
             double lowest = marks[0];
             double highest = marks[0];
             String nameLow = names[0];
             String nameHigh = names[0];
             for(int j = 1; j<marks.length; j++ ){
                 if(marks[j]<lowest){
                     if(marks[j]!=-1){
                       lowest = marks[j];
                       nameLow = names[j];
                     }
                 }
                 if(marks[j]>highest){
                     highest = marks[j];
                     nameHigh = names[j];
                 }
                 if(marks[j]==-1){
                     absent++;
                 }
             }
             System.out.println("The student with the highest mark: "+nameHigh+" "+highest);
             System.out.println("The student with the lowest mark: "+nameLow+" "+lowest);
             System.out.println("The number of students who were absent from the exam:"+absent);
             
             sc.close();
         }catch(FileNotFoundException e){
             System.out.println("File was not found ");
         }
     }    
}
