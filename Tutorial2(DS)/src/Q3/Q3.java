package Q3;
public class Q3 {
    public static <T extends Comparable> void maximum (T e1, T e2, T e3){
        if(e1.compareTo(e2)>0 && e1.compareTo(e3)>0){
            System.out.println("The maximum value of "+ e1+" "+e2
                    +" "+e3+" is "+ e1);
        }
        else if(e2.compareTo(e1)>0 && e2.compareTo(e3)>0){
            System.out.println("The maximum value of "+ e1+" "+e2
                    +" "+e3+" is "+ e2);
        }
         else if(e3.compareTo(e1)>0 && e3.compareTo(e2)>0){
            System.out.println("The maximum value of "+ e1+" "+e2
                    +" "+e3+" is "+ e3);
        }
    } 
  public static void main(String[] args){
       maximum(42,15,58);
       maximum(12.45,41.28,19.82);
  }
}
