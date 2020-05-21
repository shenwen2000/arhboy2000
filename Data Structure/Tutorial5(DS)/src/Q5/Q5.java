package Q5;
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
        return data +  " ";
    }  
}
class Stack<T>{
    private ListNode head;
  
    public Stack() {
        head = null;
    }
    public boolean isEmpty(){
        return(head == null);
    }
    public int getSize(){
        ListNode currentNode = head;
        int count = 0;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    public void clear(){
        ListNode currentNode = head;
        T temp = (T) head.getData();
        if(head != null){
            if(currentNode.getLink() == null){
                   head = null;                         
         }
           while(currentNode != null){
               currentNode = currentNode.getLink();
               head = currentNode;               
           }
           head = null;
       }
    }
    public void push(T a){
        head = new ListNode(a , head,null);
    }
    public T peek(){
        if(head == null)
            return null;
        else
            return (T) head.getData();
    }
    public T pop(){
        if(head == null)
            return null;
        T temp = (T)head.getData();
        head = head.getLink();
        return temp;
    }
}
public class Q5{
        
    public static boolean matchPair(char a, char b){
        if( a == '(' && b == ')')
            return true;
        else
            return false;
     }
    public static String parentheses(String a){
        Stack<Character> stack = new Stack<>();
        char c  = ' ';
        boolean match;
        if(a.length() % 2 != 0)
            return "is not balanced";
        else{
            for(int i = 0 ; i < a.length(); i++){
              if(isOpenning(a.charAt(i)))
                   stack.push(a.charAt(i));
              else{
                  if(stack.isEmpty())
                      return "is not balanced";
                  c = stack.pop();
                  if(matchPair(c, a.charAt(i)))
                      continue;
                  else{
                      if(isOpenning(a.charAt(i)))
                          stack.push(a.charAt(i));
                      continue;
                  }
              }
            }
            if(stack.isEmpty())
                return "is balanced";
            else
                return"is not balanced";
        }
    }
    public static boolean isOpenning(char a){
        if(a == '(')
            return true;
        else
            return false;
    }
    public static void main(String[] args){
         String[] infix = {"(())", ")()(", "((())())()","(())()))","())"};
        for(int i = 0 ; i < infix.length; i++){
            System.out.println(infix[i] + parentheses(infix[i]));
        }
    }
 }

   
  
