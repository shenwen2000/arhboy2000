package Q2;
public class Tester {
    public static void main(String[] args){
        
        System.out.println("Create a text file log with maximum record equal to 5");
        int size = 5;
        TextFileLog a = new TextFileLog(size);
        System.out.println("Text File Log Size "+size);
        a.insert("James");
        a.insert("Ahmad");
        a.insert("Siti");
        a.insert("Ramesh");
        a.insert("John");
        System.out.println(a.toString());
        System.out.println("Adding another record");
        a.insert("Hello");
       
        System.out.println("Searching for Siti in the file");
        String search = "Siti";
        if(a.exist(search)){
            System.out.println("Text File Log contains "+search);
        }
        else
            System.out.println("Text File Log does contains "+search);
        
        System.out.println("Clear the text file log");
        a.delete();
        System.out.println("Text File Log Size "+a.size());
    }
}
