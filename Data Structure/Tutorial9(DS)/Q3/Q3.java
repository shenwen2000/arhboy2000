package Q3;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        HashTable<String, String> HT = new HashTable<>();
        
        HT.put("100-101", "ICND 1");
        HT.put("200-101", "ICND 2");
        HT.put("200-120", "CCNA Routing and Switching");
        HT.put("210-260", "CCNA Security");
        boolean isFound = false;
        do{
            System.out.println("Hash Table");
            System.out.println("The number of elements in the Hash Table "+ HT.getSize());
            HT.showHashTable();
            System.out.print("\nEnter a code to search : ");
            String search = sc.next();
            if(HT.containsKey(search)){
                System.out.println("Course "+search + " : "+HT.get(search));
                isFound = true;
            }
            else
                System.out.println("The course "+search+" cannot be found");
        }while(!isFound);
    }
}
