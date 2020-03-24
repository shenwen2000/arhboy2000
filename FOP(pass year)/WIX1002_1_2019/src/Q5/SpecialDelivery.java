package Q5;
public class SpecialDelivery extends Delivery{
    private boolean weekendDelivery,nighttimeDelivery;

    public SpecialDelivery(boolean weekendDelivery, boolean nighttimeDelivery, String sender, String recipient, double weight) {
        super(sender, recipient, weight);
        this.weekendDelivery = weekendDelivery;
        this.nighttimeDelivery = nighttimeDelivery;
    }
    public double totalCost(){
        if(weekendDelivery == true && nighttimeDelivery == true){
            return (super.totalCoast()+40)*1.2;
        }
        else if(weekendDelivery == true &&  nighttimeDelivery == false){
            return (super.totalCoast()+40);
        }
        else if(weekendDelivery == false && nighttimeDelivery == true){
            return super.totalCoast()*1.2;
        }
        else {
            return super.totalCoast();
        }
           
    }

    
    public String toString() {
        if(weekendDelivery == true && nighttimeDelivery == true){
            return super.toString()+ "\nWeekend delivery\nNight Time Delivery";
        }
        else if(weekendDelivery == true &&  nighttimeDelivery == false){
            return super.toString()+"\nWeekend delivery\n";
        }
        else if(weekendDelivery == false && nighttimeDelivery == true){
            return super.toString()+ "\nNight Time Delivery\n";
        }
        else {
            return super.toString()+ "\n";
        }
    }
}
