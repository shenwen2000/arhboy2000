package Q3;
public class Q3 {
    public static void main(String[] args){
        writeLine('$',3);
        writeBlock('$',3,2,3);
    }
    public static void writeLine(char a,int times){
        if(times == 1){
            System.out.print(a+"\n\n");
        }
        else{
            System.out.print(a);
            writeLine(a,times-1);           
        }
    }
    public static void writeBlock(char a,int column,int row,int index){
        if(column == 1){
            System.out.print(a+"\n");
            column = index; 
            row--;
            if(row>=1)
                writeBlock(a,column,row,index);
        }
        else{
            System.out.print(a);
            writeBlock(a,column-1,row,index);
        }
               
    }
}
