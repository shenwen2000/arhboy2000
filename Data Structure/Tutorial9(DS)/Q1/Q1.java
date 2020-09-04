package Q1;
import java.util.Scanner;
public class Q1 {
     public static void main(String[] args){
        int count;
        char key1;
        char key2;
        SearchTest<Character> a = new SearchTest<>(1,'A',10);
        System.out.print("The Character data set are : ");
        a.showValue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Linear Search");
        System.out.print("Enter a letter to search: ");
        key1 = sc.next().charAt(0);
        if(a.found(key1))
            System.out.println(key1 +" is found");
        else
            System.out.println(key1 +" is not found");
        System.out.print("Enter two letters to search (begin end) : ");
        key1 = sc.next().charAt(0);
        key2 = sc.next().charAt(0);
        if(a.foundInRange(key1, key2))
            System.out.println("The character can be found in between "+ key1 +" and "+ key2);
        else
            System.out.println("No character can be found in between "+key1+" and "+ key2);
        
        System.out.println();
        
        SearchTest<Character> b = new SearchTest<>(1,'A',10);
        System.out.print("The Character data set are : ");
        b.showValue();
        System.out.println("Linear Search");
        System.out.print("Enter a letter to search: ");
        key1 = sc.next().charAt(0);
        if(b.found(key1))
            System.out.println(key1 +" is found");
        else
            System.out.println(key1 +" is not found");
        System.out.print("Enter two letters to search (begin end) : ");
        key1 = sc.next().charAt(0);
        key2 = sc.next().charAt(0);
        if(b.foundInRange(key1, key2))
            System.out.println("The character can be found in between "+ key1 +" and "+ key2);
        else
            System.out.println("No character can be found in between "+key1+" and "+ key2);
        System.out.println("The number of the elements in between "+
                key1+" and " + key2 +" in the data " +b.countInRange(key1, key2));
        System.out.println("The location of the elements in between "+key1+" and "
        +key2+" are : " +b.listInRange(key1, key2));
     }
}
