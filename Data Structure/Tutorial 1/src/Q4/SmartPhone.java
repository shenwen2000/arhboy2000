package Q4;
public class SmartPhone implements Comparable <SmartPhone> {
     private String name;
     private double price;
     private SmartPhone[] a;
     
    public SmartPhone(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public SmartPhone(SmartPhone[] a) {
        this.a = a;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
     public int compareTo( ){
        return 0;
     }
     public String display(){
         String list =" ";
         System.out.println("List of Smart Phone: ");
         for(int i = 0; i <a.length; i++ ){
            list = list + a[i] + " ";
         }
         return list;
     }

    @Override
    public int compareTo(SmartPhone t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
