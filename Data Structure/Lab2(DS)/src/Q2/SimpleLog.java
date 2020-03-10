package Q2;
public interface SimpleLog<T> {
      
    public void insert(T t);
    //insert item to the log
    public boolean isFull();
    // check whether the log is full
    public int size();
    // get the size of the log
    public boolean exist(T t);
    // check whether the item exists in the log
    public void delete();
    //delete the log
    public String toString();
    //display all items in the log
}
