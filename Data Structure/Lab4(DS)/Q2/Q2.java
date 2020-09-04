package Q2;
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
        return data +  "--> ";
    }  
}
class LinkedList<T>{
    private ListNode head;
    private ListNode head2;
    private ListNode head3;
   
   
    public LinkedList() {
        head = null;
    }

   public ListNode getNodeByPosition(int findIndex) {
        ListNode temp = head;
        int index = 0;
        while (temp != null) {
            if (index == findIndex) {
                return temp;
            }
            temp = temp.getLink();
            index++;
        }
        return null;
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
    public void clear(){
        head = null;
    }
    public void showlist(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    public void print(ListNode head){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
   /*
    public void splitList(){
          System.out.println("\nSplit the list into two");
           if(length() %  2 == 1){
               ListNode currentNode = head;
               ListNode previousNode = head;
               System.out.print("First List : ");
               for(int i = 0; i <= length()/2 ; i++){
                   previousNode = currentNode;
                   System.out.print(currentNode.getData().toString()+"--> ");
                   currentNode = currentNode.getLink();
               }
               currentNode.setPreviousNode(null);

               System.out.print("\nSecond List : ");
               for(int i = 0; i < length()/2; i++){
                   System.out.print(currentNode.getData().toString()+"--> ");
                   currentNode = currentNode.getLink();
               }
           }
      }
*/
      public int length(){
          ListNode currentNode = head;
          int count = 0;
          while(currentNode != null){
              count++;
              currentNode = currentNode.getLink();
          }
          return count;
      }
      /*
    public void alternateList(){
        System.out.println("\nSplit the list by alternating the nodes");
        ListNode current1 = head;
        ListNode current2 = head2;

       if (current1 != null) {
            if (current1.getLink()!= null) {
                head2 = current1.getLink();
                current2 = head2;
                for (int i = 0; i < length() / 2; i++) {
                    current1.setLink(current2.getLink());
                    current1 = current1.getLink();
                    if (current1.getLink() != null) {
                        current2.setLink(current1.getLink());
                        current2 = current2.getLink();
                    } else {
                        current2.setLink(null);
                    }
                }
                System.out.print("First list : ");
                print(head);
                System.out.print("\nSecond list : ");
                print(head2);
            }
        }
    }
*/
 /*     
    public LinkedList mergeList(LinkedList list2){
        System.out.println("\nMerge First List and Second List by alternating the nodes");
        ListNode node1 = head;
        ListNode node2 = head2;
        LinkedList<T> ot = new LinkedList<>();
        while(node1 != null || node2 != null){
            if(node1 != null){
                ot.addNode((T)node1.getData());
                node1 = node1.getLink();
            }
            if(node2 != null){
                ot.addNode((T)node2.getData());
                node2 = node2.getLink();
            }
        } 
         return ot;
    }
    
    public void reverse(){
        ListNode currentNode = head;
        reverse(currentNode);
    }
    public void reverse(ListNode currentNode){ 
       if(currentNode != null){
           reverse(currentNode.getLink());
           System.out.print(currentNode.getData() +"--> ");
       }
   }
*/
    public void setFrontData(T e){
        if(head != null) head.setData(e);
        else System.err.println("EmptyLinkedList Exception");
    }
    
    public void setLastData(T e){
        if(head != null){
            ListNode c = head;
            while(c.getLink() != null) c = c.getLink();
            c.setData(e);
        } else System.err.println("EmptyLinkedList Exception");
    }
    
    public void set(T e, int i){
        if(i == 0) setFrontData(e);
        else if(i == length()-1) setLastData(e);
        else if(i >= length()) System.err.println("IndexOutOfBound Exception");
        else {
            ListNode c = head;
            for(int j=1;j<=i;j++) c = c.getLink();
            c.setData(e);
        }
    }
    
    public T getFrontData(){
        if(head != null) return (T) head.getData();
        else {
            System.err.println("EmptyLinkedList Exception");
            return null;
        }
    }
    
    public T getLastData(){
        if(head != null){
            ListNode c = head;
            while(c.getLink() != null) c = c.getLink();
            return (T) c.getData();
        } else {
            System.err.println("EmptyLinkedList Exception");
            return null;
        }
    }
    
    public T get(int i){
        if(i == 0) return getFrontData();
        else if(i == length()-1) return getLastData();
        else if(i >= length()){
            System.err.println("IndexOutOfBound Exception");
            return null;
        } else {
            ListNode c = head;
            for(int j=1;j<=i;j++) c = c.getLink();
            return (T) c.getData();
        }
    }
    
      public LinkedList<T>[] splitList(){
        LinkedList<T>[] ret = new LinkedList[2];
        ret[0] = new LinkedList<>();
        ret[1] = new LinkedList<>();
        if(length()%2 == 0){
            for(int i=0;i<length()/2;i++)ret[0].addLastNode(get(i));
            for(int i=length()/2;i<length();i++)ret[1].addLastNode(get(i));
        } else {
            for(int i=0;i<(length()/2)+1;i++)ret[0].addLastNode(get(i));
            for(int i=(length()/2)+1;i<length();i++)ret[1].addLastNode(get(i));
        }
        
        return ret;
    }
    
    public LinkedList<T>[] alternateList(){
        LinkedList<T>[] ret = new LinkedList[2];
        ret[0] = new LinkedList<>();
        ret[1] = new LinkedList<>();
        
        for(int i=0;i<length();i++){
            if(i%2==0) ret[0].addLastNode(get(i));
            else ret[1].addLastNode(get(i));
        }
        
        return ret;
    }
    
    public void mergeList(LinkedList<T> list){
        int size = length() + list.length();
        for(int i=0,j=0;i<size;i++){
            if(i%2 != 0) {
                addNodeByPosition(list.get(j), i);
                j++;
            }
        }
    }
    
    public void reverse(int size){
        if(length()%2 == 0){
            if(size >= length()/2 + 1){
                T tmp = get(size-1);
                set(get(length()-size), size-1);
                set(tmp, length()-size);
                reverse(size-1);
            }
        } else {
            if(size > length()/2){
                T tmp = get(size-1);
                set(get(length()-size), size-1);
                set(tmp, length()-size);
                reverse(size-1);
            }
        }
    }
    
    public void reverse(){
        if(length()==0){
            return;
        }
        T temp = remove(0);
        reverse();
        addNode(temp);
        
    }
}

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String q2temp = sc.nextLine();
        LinkedList<Character> q2 = new LinkedList<>();
        for(char c : q2temp.toCharArray()) q2.addLastNode(c);
        
        System.out.println("The original list : ");
        q2.showList();
        
        // 2a. splitList()
        LinkedList<Character>[] split = q2.splitList();
        System.out.println("\n\nSplit the list into two");
        LinkedList<Character> splitList1 = split[0];
        LinkedList<Character> splitList2 = split[1];
        System.out.print("First List : ");
        splitList1.showList();
        System.out.print("\nSecond List : ");
        splitList2.showList();
        
        // 2b. alternateList()
        LinkedList<Character>[] alternate = q2.alternateList();
        System.out.println("\n\nSplit the list by alternating the nodes");
        LinkedList<Character> alternateList1 = alternate[0];
        LinkedList<Character> alternateList2 = alternate[1];
        System.out.print("First List : ");
        alternateList1.showList();
        System.out.print("\nSecond List : ");
        alternateList2.showList();
        
        // 2c. mergeList()
        System.out.println("\n\nMerge First List and Second List by alternating the nodes");
        alternateList1.mergeList(alternateList2);
        alternateList1.showList();
        
        // 2d. reverse();
        System.out.println("\n\nReverse the list. Recursive method in the LinkedList");
        alternateList1.reverse(alternateList1.length());
        alternateList1.showList();
        
        // 2e. reverse recursive in class
        System.out.println("\n\nReverse the list. Recursive method in tester class");
        reverseBack(alternateList1, alternateList1.length());
        alternateList1.showList();
    }
    
    public static void reverseBack(LinkedList list, int size){
        if(list.length()%2 == 0){
            if(size >= list.length()/2 + 1){
                Comparable tmp = list.get(size-1);
                list.set(list.get(list.length()-size), size-1);
                list.set(tmp, list.length()-size);
                reverseBack(list, size-1);
            }
        } else {
            if(size > list.length()/2){
                Comparable tmp = list.get(size-1);
                list.set(list.get(list.length()-size), size-1);
                list.set(tmp, list.length()-size);
                reverseBack(list, size-1);
            }
        }
    }
    
    public static void reverse(LinkedList<Character> list){
        if(list.length()==0){
            return;
        }
        Character temp = list.remove(0);
        reverse(list);
        list.addNode(temp);
        
    }
}
    

