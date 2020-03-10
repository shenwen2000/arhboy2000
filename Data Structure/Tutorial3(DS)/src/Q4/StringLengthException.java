package Q4;
import java.util.Scanner;
public class StringLengthException extends Exception {
    public StringLengthException(){
        super("Invalid input");
    }
    public StringLengthException(String s){
        super(s);
    }
    public static void main(String[] args){
        try{
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            s = sc.nextLine();
            if(s.length()>12)
                throw new StringLengthException("Error because Length of the sentence greater than 12.");
        }
        catch(StringLengthException e){
            System.out.println(e.getMessage());
        }
  }
}
