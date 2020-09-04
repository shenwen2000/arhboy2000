package Q5;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

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
        return data +  " --> ";
    }  
}
class Q5LinkedList<T>{
    ListNode head;

    public Q5LinkedList() {
        head = null;
    }
    
    public void addNode(T a){
        ListNode currentNode = head;
        ListNode  newNode = new ListNode(a , null , null);
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
    
    public int length(){
        int count = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            count++;
            currentNode = currentNode;
        }
        return count;
    }
    
    public void deleteFrontNode(){
        if( head != null)
            head = head.getLink();
        else
            System.out.println("The list is empty");
    }
    
    public void deleteNode(){
        ListNode currentNode = head;
        ListNode previousNode = head;
        if(head != null){
            if(currentNode.getLink() == null)
                head = null;
            else{
                while(currentNode.getLink() != null){
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);
            }
        }
        else
            System.out.println("The list is empty");
    }
    
    public void deleteNodeByPosition(int index){
        if(index == 0)
            deleteFrontNode();
        else if(index == length()-1)
            deleteNode();
        else if(index >= length())
            System.out.println("Invalid index. No node deleted");
        else{
            ListNode currentNode = head;
            for(int i = 1; i < index; i++)
                currentNode = currentNode.getLink();
            ListNode tempNode = currentNode.getLink();
            currentNode.setLink(tempNode.getLink());
            tempNode = null;
        }
    }
 
    public Iterator<T>iterator(){
        return new LinkedListIterator();
    }
    
   class LinkedListIterator implements Iterator<T>{
        
        ListNode<T> index;
        
        public LinkedListIterator(){
            index = head;
        }
        
        @Override
        public boolean hasNext() {
            return index != null;
        }

        @Override
        public T next(){
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            T val = index.getData();
            index = index.getLink();
            return val;
        }
        
    }
}
public class Q5 {
 public static void main(String[] args) {
        
       Q5LinkedList<String> li = new Q5LinkedList<>();
        li.addNode("ARS");
        li.addNode("AST");
        li.addNode("CHE");
        li.addNode("LEI");
        li.addNode("MAN");
        li.addNode("LIV");
        li.addNode("TOT");
        
        System.out.print("The list consists of ");
        li.showlist();
        
        Iterator it = li.iterator();
        
        int count = 0;
        while(it.hasNext()){
            String tmp = (String)it.next();
            if(tmp.contains("A")) {
                li.deleteNodeByPosition(count);
            } else {
                count++;
            }
        }
        
        System.out.println("\nRemove all the word that consists of the A character using iterator.");
        System.out.print("The update list consists of ");
        li.showlist();
        
    }
}
