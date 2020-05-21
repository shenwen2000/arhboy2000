package Q6;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //A queue is a First In First Out (FIFO) data structure
        System.out.print("Enter sentence : ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        
        Q1.Queue<String> a = new Q1.Queue<>();
        
        for(int i = 0 ; i < arr.length; i++){
            a.enqueue(arr[i]);
        }
        System.out.print("The original queue : ");
        a.showQueue();
        
         Q1.Queue<String> finalQueue = new Q1.Queue<>();
         Q1.Queue<String> intermediateQueue = new Q1.Queue<>();

         while (a.getSize() > 0)
         {
        // Move all items from the initial queue to the intermediate queue, 
        // except the last, which is placed on the final queue.
        int c = a.getSize() - 1;
        for (int i = 0; i < c; i++)
        {
            intermediateQueue.enqueue(a.dequeue());
        }

        finalQueue.enqueue(a.dequeue());

        // Swap the 'initialQueue' and 'intermediateQueue' references.
        Q1.Queue<String> tempQueue = a;
        a = intermediateQueue;
        intermediateQueue = tempQueue;
    }
      System.out.print("\nReverse all the elements in the queue : ");
      finalQueue.showQueue();
    }
}
