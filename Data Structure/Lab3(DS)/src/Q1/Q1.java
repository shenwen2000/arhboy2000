package Q1;
public class Q1 {
       public static void main(String[] args){
        System.out.println("Mesh Topology");
        System.out.println("There are 4 switches in the campus");
        System.out.println("The total number of connections required is "+ (topology(4)/(topology(2)*topology(4-2))));
        System.out.println("There are 7 switches in the campus");
        System.out.println("The total number of connections required is "+(topology(7)/(topology(2)*topology(7-2))));
    }
    public static int topology(int a){
        if(a == 0){
            return 1;
        }
        else
            return a * topology(a-1);
    }
}
