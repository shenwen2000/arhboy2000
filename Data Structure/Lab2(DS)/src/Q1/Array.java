package Q1;

import java.util.Arrays;

public class Array <T extends Comparable<T>> implements Q1<T> {
      private T [] arr;
      private int index = -1;
  
    public Array() {
          arr = (T[])new Integer[20];
    }

    public T[] getArr() {
        return arr;
    }
    
    public void insert(T t){
        index++;
        arr[index] = t;
    }
    
    public boolean search(T t){
        for(int i = 0; i< arr.length; i++){
            if(t.compareTo(arr[i])==0){
                return true;
            }
        }
        return false;
    }
         public void delete(T t){
         for(int i = 0 ; i < arr.length; i++){
             arr[i] = null;
         }
         index = -1;
     }
    
   public void sort(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                //will this compareTo work?
                if(arr[j].compareTo(arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
    }
        }
    public String toString(){
        StringBuilder x = new StringBuilder();
        x.append("Array Implementation\n");
        for(int i = 0; i<20 ; i++){
           x.append(arr[i]+" ");
      }
        return new String(x);
    }
}
