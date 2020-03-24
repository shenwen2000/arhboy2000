package Q3;
import java.util.Scanner;
class ListNode<T> {
    
    private T data;
    ListNode link;

    public ListNode() {
        data = null;
        link = null;
    }   

    public ListNode(T a, ListNode b) {
        data = a;
        link = b;
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
    public String toString(){
        return data + " ";
    }
}
class LinkedList<T>{
    private ListNode head;

    public LinkedList() {
        head = null;
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
  public void addNode(T a){
        ListNode newNode = new ListNode(a , null);
        ListNode currentNode = head;
        if(head == null){
            head = newNode;
        }
        else{
            while(currentNode.getLink()!= null)
                currentNode = currentNode.getLink();
        currentNode.setLink(newNode);
        }
    }
    public void clear(){
        head = null;
    }
    public ListNode getNodeAtAnyPosition(int search){
          ListNode currentNode = head;
          int index = 0;
          while(currentNode != null){
              if(index == search)
                  return currentNode;
              currentNode = currentNode.getLink();
              index++;
          }
          return null;
      }
    public void showList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
      }
    }

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total amount: ");
        int amount = sc.nextInt();
        System.out.println("Total amount: "+amount);
        
        LinkedList<Integer> list = new LinkedList<>();
        list.addNode(100);
        list.addNode(50);
        list.addNode(20);
        list.addNode(10);
        list.addNode(5);
        list.addNode(1);

        LinkedList<Integer> newList = new LinkedList<>();
        newList.addNode(amount/100);
        int fifty = amount%100;
        newList.addNode(fifty/50);
        int twenty = fifty%50;
        newList.addNode(twenty/20);
        int ten = twenty%20;
        newList.addNode(ten/10);
        int five = ten%10;
        newList.addNode(five/5);
        int one = five%5;
        newList.addNode(one);
        
        for (int i = 0; i < 6; i++) {
            System.out.println("MYR " + list.getNodeAtAnyPosition(i) + " : " 
                    + newList.getNodeAtAnyPosition(i));
        }
    }
}
