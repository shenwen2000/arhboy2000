package Q3;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter font size: ");
        int size = sc.nextInt();
        System.out.print("Enter font type: ");
        char type = sc.next().charAt(0);
        System.out.print("Enter format[1 - Vertical, 2 - Horizontal]: ");
        int format = sc.nextInt();
        
        if(format == 1)
            displayVertical(size , type);
        else if(format == 2)
            displayHorizontal(size, type);
    }public static void displayVertical(int size , char type){
        int j = 0;
        while(j<=1){
        for(int i = 0; i<(size+2); i++){
            System.out.print(type);
        }
        System.out.println();
        for(int k = 0; k<size; k++){
          for(int i = 0; i<=(size+2); i++){
              if(i==0 || i ==(size+1))
                  System.out.print(type);
              else
                  System.out.print(" ");
        }
        System.out.println();
    }
        j++;
  }
        for(int i = 0; i<(size+2); i++){
            System.out.print(type);
        }
  }public static void displayHorizontal(int size, char type){
      int space = 0;
       for(int i = 0; i<(3+(2*size)); i++){
          System.out.print(type); 
       }
       System.out.println();
       for(int j =0; j<size ; j++){
           for(int k =0; k<(3+(2*size)); k++){
               if(space%(size+1) == 0){
                   System.out.print(type);
                   space = 0;
               }
               else
                   System.out.print(" ");
            space++;   
           }
           space = 0;
           System.out.println();
       }
       for(int i = 0; i<(3+(2*size)); i++){
          System.out.print(type); 
       }
  }
}
