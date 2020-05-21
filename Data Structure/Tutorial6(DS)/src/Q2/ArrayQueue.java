package Q2;
public abstract class ArrayQueue<T> {
    
    public ArrayQueue(){};
    protected int maxSize = 10;
    public abstract boolean isEmpty();
    public abstract boolean isFull();
    public abstract int getSize();
    public abstract void enqueue(T a);
    public abstract T dequeue();
    public abstract T peek();
    public abstract void showQueue();
}
