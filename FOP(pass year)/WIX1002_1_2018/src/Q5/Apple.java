package Q5;
public class Apple extends Fruit{
    private int quantity;

    public Apple(int quantity, String name, String type) {
        super(name , type);
        this.quantity = quantity;
    }
      public double totalPrice(){
          if(type.equals("Green")){
              return 1.20*quantity;
          }
          else if(type.equals("Red")){
              return 1.80 * quantity;
          }
          else 
              return 0;
    } 

    public String toString() {
        return super.toString()+" - "+ quantity + "= RM" + totalPrice();
    }  
}
