package Q3;
import java.util.ArrayList;
public class UNO implements ADT {
    private String player;
    private int times;
    
    ArrayList<String> a = new ArrayList<>();
    
    public UNO(String player, int times) {
        this.player = player;
        this.times = times;
    }
      
    public void draw(int times){
        String color = "";
        String str = "";
        for(int i = 0 ; i < times ; i++){
            int num1 =(int)(Math.random()*4);
            switch(num1){
                case 0 :
                    color = "Green";
                    a.add(color);
                    break;
                case 1 :
                    color = "Blue";
                    a.add(color);
                    break;
                case 2:
                    color = "Green";
                    a.add(color);
                    break;
                case 3:
                    color = "Yellow";
                    a.add(color);
                    break;           
       }
            int num2 = (int)(Math.random()*11);
            switch(num2){
                case 0 :
                    str = "Zero";
                    a.add(str+" :: ");
                    break;
                case 1 :
                    str = "One";
                    a.add(str+" :: ");
                    break;
                case 2:
                    str = "Two";
                    a.add(str+" :: ");
                    break;
                case 3:
                    str = "Three";
                    a.add(str+" :: ");
                    break;
                    
                case 4:
                    str = "Four";
                    a.add(str+" :: ");
                    break; 
                    
                case 5:
                    str = "Five";
                    a.add(str+" :: ");
                    break;  
                    
                case 6:
                    str = "Six";
                    a.add(str+" :: ");;
                    break; 
                    
                case 7:
                    str = "Seven";
                    a.add(str+" :: ");
                    break;
                    
                case 8:
                    str = "Eight";
                    a.add(str+" :: ");
                    break; 
                    
                case 9:
                    str = "Nine";
                    a.add(str+" :: ");
                    break;
                    
                 case 10:
                    str = "Skip";
                    a.add(str+" :: ");
                    break;     
                            
       }
      }
     }
    public String toString(){
        StringBuilder x = new StringBuilder();
        x.append("Array Implementation\n");
        x.append(player+" draws "+times +" times\n");
        for(int i = 0 ; i <(times*2) ; i++){
          x.append(a.get(i)+" ");
        }
        return new String(x);
      }
    }

