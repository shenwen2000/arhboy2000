package Q6;
public class ShippedOrder extends Order {

    public ShippedOrder() {
    }

    public ShippedOrder(String customerName, String customerID, int quantityOrdered, double unitPrice) {
        super(customerName, customerID, quantityOrdered, unitPrice);
    }
    public double computeTotalPrice(){
        return super.computeTotalPrice()+4.0;
    }

    public String toString() {
        return "Shipped"+"\nOrder record"+"\nCustomer Name: "+customerName+"\nCustomer Id : "+customerID
                +"\nQuantity ordered: "+quantityOrdered+ "Unit price : "+unitPrice+"\nTotal Price : "+ computeTotalPrice();
    }
    
}