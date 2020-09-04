package Q8;
import Q7.CircularLinkedList;
import java.util.Scanner;
public class MusicPlay {
    
    static CircularLinkedList<Music> list;

    public MusicPlay() {
        list = new CircularLinkedList<>();
    }
    public void showlist(){
        System.out.print("\n1 Play Music | 2 Forward | 3 Back | 4 stop | -1 Exit : ");
    }
    static int times = 1;
    public void mode(int num){
        boolean exit = false;
        switch(num){
            case 1 : 
                System.out.println("Play Music : " + inEnglish());
                break;
            case 2 : 
                System.out.print("Forward One Position : ");
                times++;
                if(times == 5){
                    times = 1;
                }
                System.out.println("Play Music : "+ inEnglish());
                break;
            case 3 : 
                System.out.print("Backward One Position : ");
                times--;
                System.out.println("Play Music : " + inEnglish());
                break;
            case 4 : 
                System.out.println("Stop Playing");
                break;
            case -1 : 
                System.out.println("Exit Music Player");
                exit = true;
                break;
            default:
                System.out.println("Invalid input");
        }
    }
     public String inEnglish(){
           switch(times){
               case 1:
                   return "One";
                case 2:
                   return "Two";
                case 3:
                   return "Three";
                case 4:
                   return "Four";
                case 5:
                   return "Five";
                case 6:
                   return "Six";
                case 7:
                   return "Seven";
                case 8:
                   return "Eight";
                case 9:
                   return "Nine";
                case 10:
                   return "Ten";                           
           } 
           return "Exceed the limit";
        }
     

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("My Music Play List");
        MusicPlay mp = new MusicPlay();
        
        Music a = new Music("Music : one", "Music");
        Music b = new Music("Music : two", "Music");
        Music c = new Music("Music : three", "Music");
        Music d = new Music("Music : four", "Music");
        Music e = new Music("Music : one", "Music");
        
        list.addMusicNode(a);
        list.addMusicNode(b);
        list.addMusicNode(c);
        list.addMusicNode(d);
        list.addMusicNode(e);
        int choice;
        do{
           list.musicList();
           mp.showlist();
           System.out.print("Your choice : ");
           choice = sc.nextInt();
           mp.mode(choice);
        }while(choice != -1);
  }
}

