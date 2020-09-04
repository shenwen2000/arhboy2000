package Q2;
import java.io.*;
import java.util.Scanner;
public class Q2 {
    private Scanner sc;
    public static void main(String[] args) throws Exception{
       BufferedReader sc = new BufferedReader(new FileReader("Q3.txt"));
       PrintWriter outputStream = new PrintWriter(new FileOutputStream("Q3.txt"));
       sc.close();
       outputStream.close();
   }
    
    public static void readWriteFile(String txt, BufferedReader br, PrintWriter pw) throws Exception{
        String temp;
        if((temp = br.readLine()) == null){
            pw.println();
            return;
        }
        readWriteFile(temp,br,pw);
        if(!txt.equals("hey"))
            pw.println(txt);
    }
}
