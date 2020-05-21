package Q3;
import java.util.Scanner;
class ListNode<T> {
    private T data;
    private ListNode link;
    private ListNode previousNode;

    public ListNode(T a, ListNode b, ListNode c) {
        data = a;
        link = b;
        previousNode = c;
    }

    public ListNode() {
        data = null;
        link = null;
        previousNode = null;
    }

    public T getData() {
        return data;
    }

    public ListNode getLink() {
        return link;
    }

    public ListNode getPreviousNode() {
        return previousNode;
    }
    
    public void setData(T a) {
        data = a;
    }

    public void setLink(ListNode a) {
        link = a;
    }

    public void setPreviousNode(ListNode previousNode) {
        this.previousNode = previousNode;
    }
     
    @Override
    public String toString() {
        return data +  " ";
    }  
}
class Stack<T>{
    private ListNode head;
  
    public Stack() {
        head = null;
    }
    public boolean isEmpty(){
        return(head == null);
    }
    public int getSize(){
        ListNode currentNode = head;
        int count = 0;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    public void push(T a){
        head = new ListNode(a , head,null);
    }
    public void reverseInOrder(){
        if(isEmpty())
            System.out.println("Empty Stack");
        else{
            ListNode currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
        }
  }
    static String [] reverseArray ;
    public void original(){
        reverseArray =new String[getSize()];
        ListNode currentNode = head;
        T temp;
        for(int i=0; i<reverseArray.length; i++) {
              temp = (T)currentNode.getData();
              reverseArray[i] = (String)temp;
              currentNode = currentNode.getLink();
        }
        for(int i = reverseArray.length -1 ; i >= 0 ; i--){
            System.out.print(reverseArray[i] + " ");
        }
    }
    public void reverse(){
        for(int i = 0 ; i < reverseArray.length; i++){
            for(int j = reverseArray[i].length()-1 ; j >= 0; j--){
                System.out.print(reverseArray[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        Stack<String> list = new Stack<>();
    
        System.out.print("Enter  a sentence : ");
        String sentence = sc.nextLine();
        String [] arr = sentence.split(" ");
        //Software-defined networking (SDN) technology is an approach to network management
        for(int i = 0 ; i < arr.length; i++){
            list.push(arr[i]);
        }
        System.out.print("Orginal Sentence : ");
        list.original();
        System.out.print("\nThe sentence in reverse oder: ");
        list.reverse();
        System.out.print("\nThe word in reverse order : " );
        list.reverseInOrder();
    }
}