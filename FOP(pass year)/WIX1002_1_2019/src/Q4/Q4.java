package Q4;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Q4 {
    public static void main(String [] args){
    try{ 
      Scanner a = new Scanner(new FileInputStream("myAmbition.txt"));
      int numSentence = 0;
      int numA = 0,numB = 0,numC = 0,numD = 0,numE = 0,numF = 0,numG = 0,numH = 0,numI = 0,numJ = 0,numK,numL,numM,
          numN,numO,numP,numQ,numR,numS,numT,numU,numV,numW,numX,numY,numZ;    
      System.out.println("The essay is : ");
      while(a.hasNextLine()){
          String input = a.nextLine();
          System.out.println(input);
          for(int i = 0; i< input.length(); i++){
             if(input.charAt(i)=='.'){
                 numSentence++;
             }
           if(input.charAt(i)=='A' ||input.charAt(i)=='a'){
               numA++;
           }
           else if(input.charAt(i)=='B' ||input.charAt(i)=='b'){
               numB++;
           }
           else if(input.charAt(i)=='C' ||input.charAt(i)=='c'){
               numC++;
           }
           else if(input.charAt(i)=='D' ||input.charAt(i)=='d'){
               numD++;
           }
           else if(input.charAt(i)=='E' ||input.charAt(i)=='e'){
               numE++;
           }
           else if(input.charAt(i)=='F' ||input.charAt(i)=='f'){
               numF++;
           }
           else if(input.charAt(i)=='G' ||input.charAt(i)=='g'){
               numG++;
           }
           else if(input.charAt(i)=='H' ||input.charAt(i)=='h'){
               numH++;
           }
           else if(input.charAt(i)=='I' ||input.charAt(i)=='i'){
               numI++;
           }
           else if(input.charAt(i)=='J' ||input.charAt(i)=='j'){
               numJ++;
           }
            else if(input.charAt(i)=='K' ||input.charAt(i)=='k'){
               numJ++;
           }
            else if(input.charAt(i)=='L' ||input.charAt(i)=='l'){
               numJ++;
           }
            else if(input.charAt(i)=='M' ||input.charAt(i)=='m'){
               numJ++;
           }
            else if(input.charAt(i)=='N' ||input.charAt(i)=='n'){
               numJ++;
           }
            else if(input.charAt(i)=='O' ||input.charAt(i)=='o'){
               numJ++;
           }
            else if(input.charAt(i)=='P' ||input.charAt(i)=='p'){
               numJ++;
           }
            else if(input.charAt(i)=='Q' ||input.charAt(i)=='q'){
               numJ++;
           }
            else if(input.charAt(i)=='R' ||input.charAt(i)=='r'){
               numJ++;
           }
            else if(input.charAt(i)=='S' ||input.charAt(i)=='s'){
               numJ++;
           }
            else if(input.charAt(i)=='T' ||input.charAt(i)=='t'){
               numJ++;
           }
            else if(input.charAt(i)=='U' ||input.charAt(i)=='u'){
               numJ++;
           }
            else if(input.charAt(i)=='V' ||input.charAt(i)=='v'){
               numJ++;
           }
            else if(input.charAt(i)=='W' ||input.charAt(i)=='w'){
               numJ++;
           }
            else if(input.charAt(i)=='X' ||input.charAt(i)=='x'){
               numJ++;
           }
            else if(input.charAt(i)=='Y' ||input.charAt(i)=='y'){
               numJ++;
           }
            else if(input.charAt(i)=='Z' ||input.charAt(i)=='z'){
               numJ++;
           }
          }
      }
      System.out.println();
      System.out.println("Number of sentences : "+ numSentence);
      System.out.println("A : "+numA+" B : "+ numB);
      a.close();
  }catch(FileNotFoundException e){
    System.out.println("File was not found");
  }
 }
}
