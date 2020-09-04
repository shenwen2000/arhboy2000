package Q7;
import java.util.*;
import Q8.Music;
class ListNode<T> {
    private T data;
    private ListNode link;
    private ListNode previousNode;
    private Music music;
    
    public ListNode(T a, ListNode b, ListNode c) {
        data = a;
        link = b;
        previousNode = c;
    }
    public ListNode(Music a, ListNode b , ListNode c){
        music = a;
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
    public String printMusic(){
        return music.toString();
    }
}
public class CircularLinkedList<T>{
    ListNode head;
    ListNode music;
    
    public CircularLinkedList() {
        head = null;
        music = null;
    }
    
    public int length(){
        int count = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }
    public void addCircularNode(T a){
        ListNode currentNode = head;
        ListNode newNode = new ListNode(a , null , null);
        
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
    
    public void addMusicNode(Music a){
        ListNode currentNode = music;
        ListNode newNode = new ListNode(a,null,null);
        
        if(music == null){
            music = newNode;
        }
        else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    public void deleteCircularNode(String word){
        System.out.println("\nAfter delete a word");
        ListNode currentNode = head;
        ListNode previousNode = head;
        if(head != null){
            if(currentNode.getLink() == null){
                head = null;
            }
            else{
                while(currentNode.getLink() != null){
                    if(!currentNode.getData().equals(word)){
                        previousNode = currentNode;
                        currentNode = currentNode.getLink();
                    }
                    else{
                        previousNode.setLink(currentNode.getLink());
                        currentNode = previousNode;
                    }
                }
            }
        }
        else
            System.out.println("The list is empty");
    }
    public void CircularListShowList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    public T getNodebyPosition(int index){
         ListNode currentNode = head;
         if(head == null){
             System.out.println("The list is empty");
         }
         else{
             if(currentNode.getLink() == null){
                 return (T)currentNode.getData();
             }
             else{
                  for(int i = 0 ; i < index -1 ; i++){
                      currentNode = currentNode.getLink();
                 }
             }
         }
         return (T)currentNode.getData();
    }
    public void musicList(){
        ListNode currentNode = music;
        while(currentNode != null){
            System.out.print(currentNode.printMusic());
            currentNode = currentNode.getLink();
        }
    }
}
