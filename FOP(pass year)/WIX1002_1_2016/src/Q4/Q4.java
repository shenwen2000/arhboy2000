package Q4;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class Q4 {
    public static void main(String[] args){
    try{
      Scanner sc = new Scanner(new FileInputStream("Q4.txt"));
      int numOfNum = 0, numOfLetter = 0;
      int hasLetter = 0, hasDigit = 0,hasLower = 0, hasUpper = 0;
      boolean containSpecial = false;
      String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";
      while(sc.hasNextLine()){
          String password = sc.nextLine();
          if(password.length()>=8){
              for(int i = 0; i < password.length(); i++){
                  char x = password.charAt(i);
                  if(Character.isLetter(x)){
                          hasLetter ++;
                      }
                  else if(Character.isDigit(x)){
                      hasDigit ++;
               }
                  if(Character.isLowerCase(x)){
                      hasLower++;
                  }
                  else if(Character.isUpperCase(x)){
                      hasUpper++;
                  }
             }
          }
          if(hasLetter>0 && hasDigit > 0 && hasLower > 0 && hasUpper > 0 && containSpecial == true){
              System.out.println("Strong password");
          }
          else 
              System.out.println("Not a strong password");
          
          hasLetter = 0;
          hasDigit = 0;
          hasLower = 0;
          hasUpper = 0;
      }
 }catch(FileNotFoundException e){
    System.out.println("File was not found");
  }
 }
}
