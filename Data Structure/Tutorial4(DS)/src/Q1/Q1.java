package Q1;
class ListNode<T> {
    
     private T data;
     private ListNode link;

    public ListNode() {
       data = null;
       link = null;
    }
    
    public ListNode(T a , ListNode b){
        data = a;
        link = b;
    }

    public T getData() {
        return data;
    }

    public void setData(T a) {
        data = a;
    }

    public ListNode getLink() {
        return link;
    }

    public void setLink(ListNode a) {
        link = a;
    }

    @Override
    public String toString() {
        return " "+data + " -->";
    } 
}

class LinkedList<T>{
    private ListNode head;

    public LinkedList() {
        head = null;
    } 
    public int length(){
        int count = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    public void showList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    public void showList(T a){
        ListNode currentNode = head;
         Double temp = 0.0;
         while(currentNode != null){
            if(addUpdate(a)){
              temp = (Double)currentNode.getData();
              temp = temp + (Double)(10.5);
              currentNode.setData(temp);
              System.out.printf(" %.2f -->",currentNode.getData());
              currentNode = currentNode.getLink();
            }
            else{
                System.out.printf(" %.2f -->",currentNode.getData());
            }
       }
    }
    
    //insert at the back
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
    public boolean addUpdate(T a){
        ListNode currentNode = head; 
        
        while(currentNode != null){
           if(Double.parseDouble(currentNode.getData().toString())>20){
                return true;
        }
           else if(Double.parseDouble(currentNode.getData().toString())<20) 
               return false;
      }
        return false;
    }
}
public class Q1{
    public static void main(String [] args){
       LinkedList<Double> list = new LinkedList<>();
       list.addNode(23.1);
       list.addNode(36.5);
       list.addNode(12.8);
       list.addNode(42.6);
       list.addNode(32.8);
       /* 
       LinkedList<String> list = new LinkedList<>();
       list.addNode("23.1");
       list.addNode("36.5");
       list.addNode("12.8");
       list.addNode("42.6");
       list.addNode("32.8");
       */
       System.out.println("The number in the linked list");
       list.showList();
       System.out.println("\nThe number in the linked list adter updated");
       list.showList(20.0);
       }
    }


