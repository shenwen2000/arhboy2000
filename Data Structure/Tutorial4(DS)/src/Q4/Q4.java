package Q4;
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
        return data + " --> ";
    }
}
class LinkedList<T>{
    private ListNode head;

    public LinkedList() {
        head = null;
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
    public int sum() {
        ListNode temp = head;
        int sum = 0;
        while (temp != null) {
            sum += Integer.parseInt(temp.getData().toString());
            temp = temp.getLink();
        }
        return sum;
    }
    public int sumEven(){
        ListNode currentNode = head;
        int sumEven = 0;
        while(currentNode != null){
           if(Integer.parseInt(currentNode.getData().toString())%2==0)
               sumEven += Integer.parseInt(currentNode.getData().toString());
    currentNode = currentNode.getLink();
     }
        return sumEven;
 }

    public int numEven(){
        ListNode currentNode = head;
        int num = 0;
        while(currentNode != null){
           if(Integer.parseInt(currentNode.getData().toString())%2==0)
               num++;
           currentNode = currentNode.getLink();
     }
        return num;
 }
    public void showList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
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
public class Q4{
    public static void main(String [] args){
        LinkedList<Integer> link = new LinkedList<>();
        link.addNode(23);
        link.addNode(15);
        link.addNode(17);
        link.addNode(28);
        link.addNode(12);
        link.addNode(40);
        link.showList();
        
        System.out.println("\nLinked List has "+link.length()+" node(s)");
        System.out.println("Total is "+link.sum());
        System.out.println("Total even number is "+link.sumEven());
        System.out.println("Total even number is "+link.numEven());
    }
}

