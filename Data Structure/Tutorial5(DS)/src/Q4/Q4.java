package Q4;
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
    public static void fib(int index ){
            Stack<Integer> stack = new Stack<>();
            int temp1 = 1;
            int temp2 = 1;
            int result = 1;
            stack.push(temp1);
            stack.push(temp2);
            if(index <= 0){
                System.out.println("Invalid input");  
         }
            else{
                 if(index == 1 || index == 2){
                     System.out.println("Fib("+index+"): 1");
                 }
                 else{
                     for(int i = 2 ; i < index ; i++){
                          result += stack.peek();
                          temp2 = temp1;
                          temp1 = result;
                          stack.clear();
                          stack.push(temp1);
                          stack.push(temp2);
                    }
                     System.out.println("Fib("+index+"): "+ result);
                 }
            }
      }
    public static void main(String[] args){
                 
          fib(1);
          fib(5);
          fib(8);
          fib(14);
    
 }
}


