package Q2;
public class TextFileLog<T extends Comparable<T>> implements SimpleLog<T>{
    
    private T[] log;
    private int index, maxsize;
    
    public TextFileLog(int a){
        index = -1;
        maxsize = a;
        log = (T[])new Comparable[10];
    }
    public void insert(T t){
        if(!isFull()){
            index++;
            log[index] = t;
        }
        else
            System.out.println("The log is full");
    }
    public boolean isFull(){
        return maxsize == (index+1);
    }
    public int size(){
       return index+1;   
    }
    public boolean exist(T t){
        for(int i = 0; i < log.length; i++){
            if(t.compareTo(log[i])==0){
                return true;
            }
        }
        return false;
    }
     public void delete(){
         for(int i = 0 ; i < log.length; i++){
             log[i] = null;
         }
         index = -1;
     }
     public String toString(){
         String str = "";
         for(int i = 0; i <= index;i++){
             str += log[i]+"\n";
         }
         return str;
     }
}
