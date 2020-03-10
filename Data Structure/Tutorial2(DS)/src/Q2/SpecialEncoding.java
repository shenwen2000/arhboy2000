package Q2;
public class SpecialEncoding <T>{
    private String [] array;

    public SpecialEncoding(T[] t) {
        array = new String[t.length];
        for(int i = 0; i <t.length; i++){
            array[i] = t[i].toString();
        }
    }
    
    public String getCommand(String value){
        if(value.charAt(0)>=48 && value.charAt(0)<=57){
          switch(value){
            case "0":
                return "Copy";
            case "1":
                return "Delete";
            case "2":
                 return "Insert";
            case"3":
                return "Print";
            case"4":
                 return "Rename";
            case"5":
                 return "Paste";
          }
        }
        else {
            switch(value){
                case "C":
                 return "Copy";
            case "D":
                return "Delete";
            case "I":
                 return "Insert";
            case"P":
                 return "Print";
            case"R":
                return "Rename";
            case"V":
                 return "Paste";
            }
        }
        return "Error";
    }

    public String toString() {
        StringBuilder x = new StringBuilder();
        x.append("The Code is ");
        for(int i = 0 ; i < array.length; i++){
            x.append(array[i]+" ");
        }
        x.append("\nThe Command is ");
        for(int i = 0 ; i<array.length;i++){
            x.append(getCommand(array[i])+" ");
        }
        return new String(x);
    }
    

    public static void main(String[] args){
        Integer[] num = {3,2,5,0,1};
        Character[] letter = {'P','I','V','C','D'};
        SpecialEncoding<Integer> a = new SpecialEncoding<>(num);
        SpecialEncoding<Character> b = new SpecialEncoding<>(letter);
        System.out.println(a.toString());
        System.out.println(b.toString());
   }
}
