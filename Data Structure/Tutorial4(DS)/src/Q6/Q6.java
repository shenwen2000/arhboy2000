package Q6;
class ListNode <T> {
    private T data;
    private ListNode link;

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

    @Override
    public String toString() {
        return data + " --> ";
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
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }  

    public void addFornt(T a){
        ListNode currentNode = head;
        ListNode newNode = new ListNode(a,null);
        if(head == null)
            head = newNode;
        else{
            newNode.setLink(currentNode);
            head = newNode;
            currentNode = newNode;
        }
    }
  public void showlist(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
   public int midElement(int mid){
      ListNode currentNode = head;
      int temp;
      for(int i = 0; i < mid; i++){
          currentNode = currentNode.getLink();
      } 
       temp = Integer.parseInt(currentNode.getData().toString());
       return temp;
  }
}
public class Q6{
    public static void main(String[] args){      
        LinkedList <Integer> link = new LinkedList <>();
        link.addFornt(78);
        link.addFornt(45);
        link.addFornt(34);
        link.addFornt(23);
        link.addFornt(17);
        link.addFornt(10);
        link.addFornt(8);
        
        link.showlist();
        int mid = (link.length()/2)+1;
        System.out.println("\nThe median is "+link.midElement((link.length()/2)));
    }
}
