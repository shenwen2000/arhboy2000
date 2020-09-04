package Q3;
import java.util.*;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
     
        System.out.print("Enter number of elements: ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.print("The elements of the arrays: ");
        for(int i = 0 ;  i < num ; i ++){
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i]);
        }
        System.out.println();
        String str = "";
        for(int i = 0; i <arr.length; i++){
            str += Integer.toString(arr[i]);
        }
        permutation("",str);
        String [] nonDuplicate = store.split(" ");
        for(int i = 0; i < nonDuplicate.length; i++){
            System.out.print(nonDuplicate[i]+" ");
        }
        System.out.println();
    }
   
    public static boolean checked(int check,ArrayList list){
        boolean checked = false;
        if(list.contains(check))
            return true;
        else
            return false;
    }
    static String store ="";
    static String temp = "";
    public static void permutation(String done , String ny){
             temp = "";
             if(ny.isEmpty()){
                 temp = temp + done;
                 store = store+temp+" ";
                 System.out.println("Temp: "+temp);
         }
             else{
                 for(int i = 0 ; i < ny.length(); i ++){
                     permutation(done+ny.charAt(i),ny.substring(0,i)
                             +ny.substring(i+1,ny.length()));
           }
         }
    }
}