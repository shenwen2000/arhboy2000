package Q4;
public class LinkedListDice {
    private int [] rolls;
    
    public void roll(int times){
        rolls = new int[times];
        for(int i = 0;i<times; i++){
            rolls[i] = (int)(1+Math.random()*6);
        }
        System.out.println("Linked List Implementation: Roll "+times+" time(s)");
        for(int j = 0 ; j < times; j++){
            System.out.print(rolls[j]+" ");
        }
    }
    public String toString(){
        StringBuilder x = new StringBuilder();
        x.append("\nTotal is ");
        int ans = 0 ;
        for(int i = 0 ; i< rolls.length; i++){
            ans += rolls[i];
        }
          String str = Integer.toString(ans);
          x.append(" "+str);
          return new String(x);
    }
}
