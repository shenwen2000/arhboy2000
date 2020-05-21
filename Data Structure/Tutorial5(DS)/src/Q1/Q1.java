package Q1;
class ListNode<T> {
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

    public void setData(T data) {
        this.data = data;
    }

    public void setLink(ListNode link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return " <-- " + data;
    }
}
class Stack<T>{
    private ListNode head;

    public Stack() {
        head = null;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public int getSize(){
        int count = 0;
        ListNode currentNode = head;
        while(currentNode!= null){
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }
    public void push(T a){
        head = new ListNode(a, head);
    }
    public T pop(){
        if(head == null)
            return null;
        T temp = (T)head.getData();
        head = head.getLink();
        return temp;
    }
    public void showStack(){
        if(isEmpty())
            System.out.println("Empty Stack");
        else{
            ListNode currentNode = head;
            while(currentNode != null){
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
        }
    }
    public T peek(){
        if(head == null)
            return null;
        else
            return(T)head.getData();
    }
}
public class Q1{
    public static void main(String [] args){
        
        Stack<Character> list = new Stack<>();
        System.out.println("Stack implementation using Linked List");
        System.out.println("Insert three nodes into the stack");
        list.push('A');
        list.push('N');
        list.push('D');
        list.showStack();
        System.out.println("\nPop one node from the stack");
        list.pop();
        list.showStack();
        System.out.println("\nThe element on the top of the stack is "+list.peek());
        list.showStack();
        System.out.println("\nThe number of elements in the stack is "+list.getSize());
    }
}
