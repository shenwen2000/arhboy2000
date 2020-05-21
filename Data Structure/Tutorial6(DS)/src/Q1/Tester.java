package Q1;
public class Tester {
    public static void main(String[] args){
        
        Queue<Character> a = new Queue<>();
        
        System.out.println("Queue Implementation using Linked List");
        System.out.println("Enqueue three nodes");
        a.enqueue('B');
        a.enqueue('M');
        a.enqueue('W');
        a.showQueue();
        System.out.println("\nDequeue one node");
        a.dequeue();
        a.showQueue();
        System.out.println("\nThe front node of the queue is "+a.peek());
        System.out.println("The queue size is "+a.getSize());
    }
}
