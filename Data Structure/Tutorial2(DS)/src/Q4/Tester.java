package Q4;
public class Tester {
    public static void main(String[] args){
        
        ArrayDice a = new ArrayDice();
        a.roll(5);
        System.out.println(a.toString());
        a.roll(4);
        System.out.println(a.toString());
        
        LinkedListDice b = new LinkedListDice();
        b.roll(3);
        System.out.println(b.toString());
        b.roll(4);
        System.out.println(b.toString());
    }
}
