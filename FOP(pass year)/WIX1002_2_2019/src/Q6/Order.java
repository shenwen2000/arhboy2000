package Q6;
public class Order {
    protected String customerName,customerID;
    protected int quantityOrdered;
    protected double unitPrice;

    public Order() {
    }

    public Order(String customerName, String customerID, int quantityOrdered, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantityOrdered = quantityOrdered;
        this.unitPrice = unitPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double computeTotalPrice(){
        double totalPrice;
        totalPrice = quantityOrdered*unitPrice;
        return totalPrice;
    }

    public String toString() {
        return "Order record"+"\nCustomer Name: "+customerName+"\nCustomer Id : "+customerID
                +"\nQuantity ordered: "+quantityOrdered+ "Unit price : "+unitPrice+"\nTotal Price : "+ computeTotalPrice();
    }
    
}
