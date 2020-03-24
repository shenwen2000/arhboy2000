package Q5;
public class CreditCard {
    private String name,num,type;
    private double total;
    public CreditCard(String name, String num, String type) {
        this.name = name;
        this.num = num;
        this.type = type;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public String toString() {
        return "CreditCard : "+name +" ("+num+")"+"\nCard Type : "+type +"\nTotal Cash Reward : "
                +getTotal()+"\nCredit Card: "+name+" ("+num+")"+"\nCard Type : "+ type
                +"\nThe best card is Cash Rebate Card";
    }
    
}
