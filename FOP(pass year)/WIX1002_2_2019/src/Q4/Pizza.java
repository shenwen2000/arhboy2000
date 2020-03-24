package Q4;
public class Pizza {
   private String size;
   private int numOfCheeseTopping, numOfBeefTopping,numOfChickenTopping;

    public Pizza() {
    }
    
    public Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public String getSize() {
        return size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double conputerCost(){
        if(size.equalsIgnoreCase("Small")){
            return 10+((numOfCheeseTopping+numOfBeefTopping+numOfChickenTopping)*2);
        }
        else if(size.equalsIgnoreCase("Medium")){
            return 12+((numOfCheeseTopping+numOfBeefTopping+numOfChickenTopping)*2);
        }
        else if(size.equalsIgnoreCase("Large")){
            return 14+((numOfCheeseTopping+numOfBeefTopping+numOfChickenTopping)*2);
        }
        else 
            return 0;
    }
    public void display(){
        System.out.println("Pizza size: "+ size);
        System.out.println("Quantity of CheeseTopping: "+numOfCheeseTopping);
        System.out.println("Quantity of BeefTopping: "+numOfChickenTopping);
        System.out.println("Quantity of ChickenTopping: "+numOfChickenTopping);
        System.out.printf("Total cost:RM $%.2f",conputerCost());
    }
}
