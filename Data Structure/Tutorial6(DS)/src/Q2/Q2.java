package Q2;
public class Q2 <T> extends ArrayQueue<T> {
    private T [] arr;
    private int rear;
    private int head;
    int size;
    
    public Q2(){
        arr = (T[]) new Object [maxSize];
        head = 0;
        rear = 0;
    }
    public boolean isEmpty(){
        return(size == 0);
    }    
    public boolean isFull(){
         return (size == maxSize);
    }
    public int getSize(){
        return size;
    }
    public void enqueue(T a){
         if(!isFull()){
             arr[rear] = a;
             size++;
             rear++;
         } 
         else{
             return;
         }
    }
    public T dequeue(){
        if(size == 0)
            return null;
        size--;
        T temp = (T) arr[head%maxSize];
        arr[head%maxSize] = null;
        head = (head+1)%maxSize;
        return temp;
    }
    public T peek(){
        return arr[head];
    }
    public void showQueue(){
        for(int i = head ; i < arr.length; i++){
            System.out.print(arr[i]+" -->");
        }
    }
}
