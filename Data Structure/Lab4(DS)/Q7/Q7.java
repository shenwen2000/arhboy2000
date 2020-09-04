package Q7;
import java.util.*;
public class Q7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        CircularLinkedList <String> CircularList = new CircularLinkedList<>();
        
        System.out.print("Enter a sentence : ");
        String sentence = sc.nextLine();
        System.out.println();
        
        String [] arr =  sentence.split(" ");
        System.out.println("The words in the circular linked list");
        for(int i = 0 ; i < arr.length ; i++){
            CircularList.addCircularNode(arr[i]);
        }
        
        CircularList.addCircularNode(arr[0]);
        CircularList.CircularListShowList();
        CircularList.deleteCircularNode("UM");
        CircularList.CircularListShowList();
        System.out.println("\nThe second item in th list is " + CircularList.getNodebyPosition(2));
    }
}

