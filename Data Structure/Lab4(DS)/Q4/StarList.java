package Q4;
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
        return data +  " --> ";
    }  
}
class LinkedList<T>{
    
    private ListNode head;
    private ListNode head2;
    private ListNode head3;
    
    public LinkedList() {
        head = null;
    }
    
    public void showlist(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
        public void addNode(T a){
        ListNode currentNode = head;
        ListNode newNode = new ListNode(a, null,null);
        if(head == null)
            head = newNode;
        else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
      public int length(){
          ListNode currentNode = head;
          int count = 0;
          while(currentNode != null){
              count++;
              currentNode = currentNode.getLink();
          }
          return count;
      }
}
public class StarList{
    public static void main(String [] args){
        LinkedList<Character> player1 = new LinkedList<>();
        LinkedList<Character> player2 = new LinkedList<>();
        
        int rowDice;
        int whoFisrt = decideWhoStartFirst();
        int winner = 0;
        System.out.println("player "+decideWhoStartFirst()+" starts first");
        while(player1.length() <= 20 && player2.length()<=20){
            
           if (whoFisrt == 1){
               rowDice = (int)(1+Math.random()*6);
               for(int i = 0; i < rowDice ; i ++){
                    player1.addNode('*');
               }
               System.out.print("Player 1: ");
               player1.showlist();
               System.out.println();
               
               if(player1.length() > 20 ){
               winner = 1;   
               break;
               }
               
               rowDice = (int)(1+Math.random()*6);
               for(int i = 0 ; i < rowDice; i++){
                   player2.addNode('*');  
               }
               System.out.print("Player 2: ");
               player2.showlist();
               System.out.println();
               if(player2.length() > 20){
                   winner = 2;  
                   break;
               }
           }
           else if(whoFisrt == 2){
               rowDice = (int)(1+Math.random()*6);
               for(int i = 0 ; i < rowDice; i++){
                   player2.addNode('*');
               }
               System.out.print("Player 2: ");
               player2.showlist();
               System.out.println();
               if(player2.length() > 20){
                   winner = 2;  
                   break;
               }
               rowDice = (int)(1+Math.random()*6);
               for(int i = 0; i < rowDice ; i ++){
                    player1.addNode('*');
               }
               System.out.print("Player 1: ");
               player1.showlist();
               System.out.println();
               if(player1.length() > 20 ){
               winner = 1;  
               break;
               }
           }
        }
        System.out.println("Player "+winner +" wins the game");
    }
    public static int decideWhoStartFirst(){
        int rand;
        rand = (int)(Math.random()*2);
        if(rand == 0)
            return 1;
        else
            return 2;
    }
}
