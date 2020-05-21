package Q3;
public class Q3 {
    public static void main(String[] args){
        
        // without using queue
        int numOfCustomer = 0;
        final int NUMOFPHO = 30;
        System.out.println("Simulate a Queue to puchase MY phone");
        System.out.println("without using queue");
        for(int i = 0 ; i <= NUMOFPHO;){
            int numBuy = (int)(1+Math.random()*3);
            System.out.println("Customer "+ (++numOfCustomer)+" : "+numBuy + "set(s) -->");
            i += numBuy;
        }
        System.out.println("Number of Customer : " + (numOfCustomer));
        System.out.println("");
        System.out.println("Using queue");
        //using queue
        Q1.Queue<Integer> a = new Q1.Queue<>();
        for(int i = 0 ; i <= NUMOFPHO;){
             int numBuy = (int)(1+Math.random()*3);
             a.enqueue(numBuy);
             i+= numBuy;
        }
        numOfCustomer = a.getSize();
        for(int i = 0; i < numOfCustomer; i++)
             System.out.printf("Customer %d : %d set(s) -->\n",i+1,a.dequeue());
        
        System.out.println("Number of Customer : " + (numOfCustomer));
    }
 
}
