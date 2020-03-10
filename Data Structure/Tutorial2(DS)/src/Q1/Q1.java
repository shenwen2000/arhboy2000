package Q1;
public class Q1 {
    public static void main(String[] args){
        display("Hello", "World");
        display(12.4,64.3);
        display(20,35);
        display("Hello", "Hello");
        
}
    public static<T extends Comparable> void display(T e1, T e2){
      System.out.printf("The parameters value are: %s and %s\n",e1,e2);
      if( e1 instanceof Integer){
          
          System.out.println("The sum of the integer is " +((Integer)(e1)+(Integer)(e2)));
      }
      else if(e1 instanceof Double){
          System.out.println("The sum of the double is "+((Double)(e1)+(Double)(e2)));
      }
      else if(e1 instanceof String){
         if(e1.compareTo(e2) == 0){
            System.out.println("The string is equal");
        } 
         else
             System.out.println("The string is not equal");
              
      }
    }
}
