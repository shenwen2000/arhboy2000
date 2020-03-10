package Q4;
public class Tester {
    public static void main(String[] args){
        
        SmartPhone [] array = new SmartPhone[4];
        array[0] = new SmartPhone("iPhone",2400);
        array[1] = new SmartPhone("Samsumg",2200);
        array[2] = new SmartPhone("Nokia",1400);
        array[3] = new SmartPhone("LG",1800);
        
        SmartPhone a = new SmartPhone(array);
        System.out.println(a.display());
    }
}
