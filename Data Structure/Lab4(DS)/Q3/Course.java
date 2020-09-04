package Q3;
import java.util.*;
class ListNode {
    private String courseCode;
    private String courseName;
    private int creditHour;
    private String grade;    
    private ListNode link;
    private ListNode previousNode;

    public ListNode(String courseCode, String courseName, int creditHour, String grade, ListNode link, ListNode previousNode) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHour = creditHour;
        this.grade = grade;
        this.link = link;
        this.previousNode = previousNode;
    }

    public ListNode() {
        courseCode = null;
        courseName = null;
        creditHour = 0;
        grade = null;
        link = null;
        previousNode = null;
    }

    ListNode(String wxX101, String programming, int i, char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public String getGrade() {
        return grade;
    }

    public ListNode getLink() {
        return link;
    }

    public ListNode getPreviousNode() {
        return previousNode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setLink(ListNode link) {
        this.link = link;
    }

    public void setPreviousNode(ListNode previousNode) {
        this.previousNode = previousNode;
    }
      
    @Override
    public String toString() {
        return "Course : " + courseCode +" ("+courseName+") "+" - "+creditHour
                +" credit hours."+" Grade : "+ grade + " --> \n";
    }  
}
class LinkedList<T> {
    private ListNode head;
    private ListNode head2;
    private ListNode head3;
    
    public LinkedList() {
        head = null;
    }
    public ListNode getNodeByPosition(int findIndex) {
        ListNode temp = head;
        int index = 0;
        while (temp != null) {
            if (index == findIndex) {
                return temp;
            }
            temp = temp.getLink();
            index++;
        }
        return null;
    }
    public void addNode(String a,String b ,int c ,String d){
        ListNode currentNode = head;
        ListNode newNode = new ListNode(a,b,c,d,null,null);
        if(head == null)
            head = newNode;
        else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
     public void showlist(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
     public int length(){
         int count = 0;
         ListNode currentNode = head;
         while(currentNode != null){
             count++;
             currentNode = currentNode.getLink();
         }
         return count;
     }
}
public class Course{
    public static void main(String [] args){
        
        LinkedList<ListNode> student = new LinkedList<>();
       
        System.out.println("The list consist of");
        student.addNode("WXX101", "Programming", 5, "B");
        student.addNode("WXX201", "Networking", 4, "C");
        student.addNode("WXX301", "Operating System", 3, "A");
        student.showlist();
        int point = 0;
        int credit = 0;
        double average = 0;
        
        for(int i = 0 ; i < student.length(); i ++){
              point += getGrade(student,i);
              credit += getCreditHour(student,i);
        }
        System.out.println("Total point is "+ point);
        System.out.println("Total credit is "+credit);
        average = (point*1.0/ credit);
        System.out.printf("Grade point average is %.2f",average);
    }
        public static int getGrade(LinkedList<ListNode> student,int i){
               return getPoint(student.getNodeByPosition(i).getGrade(),student,i);
        }
        public static int getPoint(String grade,LinkedList<ListNode> student,int i){
            switch(grade){
                case "A":
                    return 4 * getCreditHour(student,i);
                case "B":
                    return 3 * getCreditHour(student,i);
                case "C":
                    return 2 * getCreditHour(student,i);
                case "D":
                    return 1 * getCreditHour(student,i);
                case "F":
                    return 0 * getCreditHour(student,i);
            }
            return 0;
        }
        public static int getCreditHour(LinkedList<ListNode> student, int i){
            return student.getNodeByPosition(i).getCreditHour();
        }
}
