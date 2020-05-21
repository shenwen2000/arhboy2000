package Q4;
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
public class Q4 {
    public static void main(String[] args){
        
        Q1.Queue<Character> a = new Q1.Queue<>();
        String[] sentence = {"kayak","Welcome","Was it a car or a cat I saw?",
            "civic","race car"};
        for(int i = 0; i < sentence.length; i++){
            for(int j = 0 ; j < sentence[i].length(); j++){
                a.enqueue(sentence[i].charAt(j));
       }
           System.out.print(sentence[i]);
           check(a);
     }
   }
    public static void check(Q1.Queue<Character> a){
        int size = a.getSize();
        int times = 0;
        Stack <Character> stack = new Stack<>();
        if(a.getSize()%2 == 0){
            for(int i = 0 ; i < size/2 ; i++){
               stack.push(a.dequeue());
            }
            for(int i = 0 ; i < size/2 ; i++){
                if(a.dequeue() == stack.pop())
                    times++;
                else
                    continue;
            }
        if(times == (size/2))
            System.out.print(" is a palindome\n");
        else
            System.out.print(" is not a palindrome\n");
          }
        else{
            for(int i = 0 ; i < size/2 ; i++){
                stack.push(a.dequeue());
            }
            a.dequeue();
            for(int i = 0; i < size/2 ; i++ ){
                if(a.dequeue() == stack.pop())
                    times++;
                else
                    continue;
            }
        if(times == (size/2))
            System.out.print(" is a palindome\n");
        else
            System.out.print(" is not a palindrome\n");
          }
        }
    }
 

