package Q1;
import java.util.*;
class ListNode<T> {
    private T data;
    private ListNode link;

    public ListNode(T a, ListNode b) {
        data = a;
        link = b;
    }

    public ListNode() {
        data = null;
        link = null;
    }

    public T getData() {
        return data;
    }

    public ListNode getLink() {
        return link;
    }

    public void setData(T a) {
        data = a;
    }

    public void setLink(ListNode a) {
        link = a;
    }

    @Override
    public String toString() {
        return data +  "--> ";
    }
    
}
class LinkedList<T>{
    private ListNode head;
    
    public LinkedList() {
        head = null;
    }
    public void addBack(T a){
        ListNode currentNode = head;
        ListNode newNode = new ListNode(a,null);
        if(head == null){
            head = newNode;
        }
        else{
           while(currentNode.getLink() != null){
               currentNode = currentNode.getLink();
           } 
           currentNode.setLink(newNode);
        }
    }
    public void clear(){
        head = null;
    }
    public void addFront(T a){
        ListNode currentNode = head;
        ListNode newNode = new ListNode(a,null);
        if(head == null)
            head = newNode;
        else{
            newNode.setLink(currentNode);
            currentNode = newNode;
            head = newNode;
        }
    }
     public void addSortNode(T a){
        ListNode currentNode = head;
        ListNode newNode = new ListNode(a,null);
        if(head == null){
            head = newNode;
        }
        else{
           while(currentNode.getLink() != null){
               currentNode = currentNode.getLink();
           } 
           currentNode.setLink(newNode);
        }
    }
    public void showlist(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
}
public class Q1{
    public static void main(String[] agrs){
        LinkedList<Integer> list = new LinkedList<>();
        
        int [] arr = new int [10];
        System.out.print("The random number are : ");
        for(int i = 0 ; i < 10; i++){
            int rand =(int)(Math.random()*101);
            System.out.print(rand +" ");
            arr[i] = rand;
        }
        System.out.println("\n\nInsert the random numbers at the back of the linked list");
        for(int i = 0; i <10; i++){
              list.addBack(arr[i]);
        }
        list.showlist();
        list.clear();
        System.out.println("\n\nInsert the random numbers in front of the linked list");
        for(int j = 0; j<10; j++){
            list.addFront(arr[j]);
        }
        list.showlist();
        Arrays.sort(arr);
        list.clear();
        System.out.println("\n\nInsert the random numbers in a sorted linked list");
        for(int k = 0; k<10; k++){
            list.addSortNode(arr[k]);
        }
        list.showlist();
    }
}
