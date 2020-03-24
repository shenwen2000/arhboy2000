package Q5;
public class Watermelon extends Fruit{
    private double weight;

    public Watermelon(double weight, String name, String type) {
        super(name, type);
        this.weight = weight;
    }
    public double totalPrice(){
        if (type.equals("Local")) {
            if (weight>5) {
                return 1.65*weight;
            }
            else if (weight>=2) {
                return 1.95*weight;
            }
            else {
                return 2.25*weight;
            }                    
        }
        else if (type.equals("Imported")) {
            if (weight>5) {
                return 3.15*weight;
            }
            else if (weight>=2) {
                return 3.45*weight;
            }
            else {
                return 3.75*weight;
            }    
        }
        else {
            return 0;
        }
      
    } 
     public String toString(){
            return super.toString()+" - "+ weight + "kg"+"=RM"+ totalPrice();
        }
}
