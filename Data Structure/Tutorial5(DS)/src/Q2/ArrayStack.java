package Q2;
public class ArrayStack {
    private static final int MAXSIZE = 10;
    private int capacity ;
    private int top = -1;
    String[] a;
    
    public ArrayStack(int cap){
        capacity = cap;
        a = new String [capacity];
    }
    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        return getSize() >= MAXSIZE; 
}
    public int getSize(){
        return top+1;
    }
    public void push(String o){
       if(isFull()){
           System.out.println("Stack is full");
           return;
       } 
       else{
           a[++top] = o;
       }
    }
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        System.out.println("\nPop one node from the stack");
          String temp = a[top];
          top--;
          return temp;
    }
    public String peek(){
        if(isEmpty())
            return null;      
        else
            return a[top]; 
    }
    public void showStack(){
        if(isEmpty())
            System.out.println("Empty Stack");
        else{
            for(int i = top ; i >=0; i --){
                System.out.print("<-- "+a[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        
        ArrayStack list = new ArrayStack(3);
         
        System.out.println("Stack implementation using Array");
        System.out.println("Insert three nodes into the stack");
        list.push("A");
        list.push("N");
        list.push("D");
        list.showStack();
        list.pop();
        list.showStack();
        System.out.println("\nThe element on the top of the stack is "
                  + list.peek());
        list.showStack();
        System.out.println("\nThe number of elements in the stack is " + list.getSize());
    }
}

