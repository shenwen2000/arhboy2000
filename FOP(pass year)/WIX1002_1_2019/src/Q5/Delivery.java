package Q5;
public class Delivery {
    private String sender,recipient;
    private double weight;

    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    public double totalCoast(){
        double totalPrice;
        if(weight<=5){
            totalPrice = (weight*2.8);
        }
        else if(weight <= 20){
            totalPrice = (5 * 2.8) + ((weight - 5)*5.2);
        }
         else if(weight <= 50){
            totalPrice = (5 * 2.8) +(15*5.2)+ ((weight - 20)*7.00);
        }
         else 
            totalPrice = (5 * 2.8) +(15*5.2)+(30*7.00) +((weight - 50)*5.2);
        return totalPrice;
        }

    public String toString() {
        return "From : "+ sender + "To: "+recipient+"\nWeight of Package : "+weight+"kg\nShipping Cost : RM"
                +totalCoast();
    }
    
    }

