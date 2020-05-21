package Q6;
import java.io.*;
import java.util.*;
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
class Q6Stack<T>{
    ListNode head;

    public Q6Stack() {
        head = null;
    }
    public void push(T a){
       head = new ListNode(a ,head,null);
    }
    public void showlist(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    
    public int size(){
        int count = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode;
            count++;
        }
        return count;
    }
    public listIterator<T> iterator(){
        return new listIterator(this);
    }
    class listIterator<T> implements Iterator<T>{
         // ArrayList<Integer> a = new ArrayList<>();
         //LinkedList<Integer> b = new LinkedList<>();
          private int index = -1;
          
          ListNode<T> currentNode;
          
          public listIterator(Q6Stack list){
                currentNode = list.head;           
   }
          public boolean hasNext(){
              return currentNode != null;
          }
         public T next(){
            // if(hasNext()){
                T op = currentNode.getData();
                currentNode = currentNode.getLink();
                index++;
                return op;
             //}
             //throw new  NoSuchElementException();
          }
    }
}
    
 
