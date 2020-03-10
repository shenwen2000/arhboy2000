package Q1;
public class Tester {
    
    public static void main(String[] args) {

         Array a = new Array();
        
        for (int i = 0; i < 20; i++) {
            int temp=(int)(Math.random()*101);
            if(a.search(a.getArr()[i]))
                a.insert(temp);
        }

        a.sort();
        System.out.println(a.toString());
 }
}
