package Q2;
public class Tester {
    public static void main(String[] args){
        
        Q2<Character> a = new Q2<>();
        System.out.println("Queue Implementation using Array");
        System.out.println("Enter ten nodes");
        a.enqueue('A');   //
        a.enqueue('B');   //
        a.enqueue('C');   //
        a.enqueue('D');   //
        a.enqueue('E');   //
        a.enqueue('F');
        a.enqueue('G');
        a.enqueue('H');
        a.enqueue('I');
        a.enqueue('J');   //10
        a.enqueue('K');
        a.enqueue('L');
        a.enqueue('M');
        a.enqueue('N');
        a.showQueue();
        System.out.println("\nDequeue one node");
        a.dequeue();
        a.showQueue();
        System.out.println("\nThe front node of the queue is "+a.peek());
        System.out.println("The queue size is "+a.getSize());
    }
}
