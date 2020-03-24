package Q5;
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
class LinkList<T>{
    private ListNode head;

    public LinkList() {
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
    public void addNote(T a){
        ListNode currentNode = head;
        ListNode newNode = new ListNode(a , null);
        if(head == null){
            head = newNode;
        }
       else{
            while(currentNode.getLink()!= null)
                currentNode = currentNode.getLink();
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
    public int rand(int num){
        return (int)(Math.random()*num);        
        }
    public void deleteFour(int x){
        ListNode currentNode = head;
        ListNode previousNode = head;
        boolean atHead = false;
        if(head != null){
            if(currentNode.getLink() == null)
                head = null;
            else{
                  while(currentNode.getLink() != null){
                      if(Integer.parseInt(currentNode.getData().toString())== 4){
                          if(currentNode.getLink() != null){
                              if(currentNode == previousNode){
                                    currentNode = currentNode.getLink();
                                    previousNode = currentNode;
                                    head = currentNode;
                                    atHead = true;
                     }else{
                            previousNode.setLink(currentNode.getLink());
                          }      
                }
                 else{
                     previousNode.setLink(null);
                          }                     
           }
                      if(!atHead){
                          previousNode = currentNode;
                          currentNode = currentNode.getLink();
                      }
          }
        }
      }
    }
}
public class Q5{
    public static void main(String[] args){
        LinkList <Integer> link = new LinkList<>();
        int num = 10;
        for(int i = 0; i < 15 ; i++){
            link.addNote(link.rand(num+1));
        }
        System.out.println("Linked List has "+ link.length() + " nodes(s)");
        link.showlist();
        System.out.println("\nDelete the number 4 from the list");
        link.deleteFour(4);
        System.out.println("Linked List has "+ link.length() + " nodes(s)");
        link.showlist();
    }
}