package Q6;
class DoubleListNode<T> {
    
    private T  data;
    private DoubleListNode previousLink;
    private DoubleListNode nextLink;
    
    public DoubleListNode(){
        data = null;
        previousLink = null;
        nextLink = null;
    }
    public DoubleListNode (T a , DoubleListNode b , DoubleListNode c){
        data = a;
        previousLink = b;
        nextLink = c;
    }

    public T getData() {
        return data;
    }

    public DoubleListNode getPreviousLink() {
        return previousLink;
    }

    public DoubleListNode getNextLink() {
        return nextLink;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPreviousLink(DoubleListNode previousLink) {
        this.previousLink = previousLink;
    }

    public void setNextLink(DoubleListNode nextLink) {
        this.nextLink = nextLink;
    }
    public void setLink(DoubleListNode a , DoubleListNode b){
        previousLink = a;
    }
    public String toString(){
        return " <-- " + data + " -->";
    }
}
class DoubleLinkedList<T>{
    
    private DoubleListNode head;
    
    public DoubleLinkedList(){
        head = null;
    }
    public int length(){
        int count = 0;
        DoubleListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getNextLink();
            count++;
        }
        return count;
    }
    public void showList(){
        DoubleListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getNextLink();
        }
    }
    public void addRightNode(T a){
        DoubleListNode newNode = new DoubleListNode(a , null , null);
        DoubleListNode currentNode = head;
        
        if(head == null){
            head = newNode;
        }
        else{
            while(currentNode.getNextLink() != null)
                currentNode = currentNode.getNextLink();
            currentNode.setNextLink(newNode);
            newNode.setPreviousLink(currentNode);
        }
    }
    public void deleteLeftNode(){
        if(head != null){
            if(head.getNextLink() == null)
                head = null;
            else{
                head = head.getNextLink();
                head.setPreviousLink(null);
            }
        }
        else
            System.out.println("The list is empty");
    }
    public void deleteRightNode(){
        DoubleListNode currentNode = head;
        DoubleListNode previousNode = head;
        if(head != null){
            if(currentNode.getNextLink() == null)
                head = null;
            else{
                while(currentNode.getNextLink() != null){
                    previousNode = currentNode;
                    currentNode = currentNode.getNextLink();
                }
                currentNode = null;
                previousNode.setNextLink(null);
            }
        }
        else
            System.out.println("The list is empty");
    }
    public void deleteNodeByPosition(int index){
        if(index == 0)
            deleteLeftNode();
        else if(index == length()-1)
            deleteRightNode();
        else if (index >= length())
            System.out.println("Invalid index. No node deleted");
        else{
            DoubleListNode currentNode = head;
            for(int i = 1 ; i < index ; i ++)
                currentNode = currentNode.getNextLink();
            DoubleListNode tempNode = currentNode.getNextLink();
            currentNode.setNextLink(tempNode.getNextLink());
            if(tempNode.getNextLink() != null)
                tempNode.getNextLink().setPreviousLink(currentNode);
            tempNode = null;
        }
    }
    public void replace(int index, int num){
        DoubleListNode currentNode = head;
        for(int i = 0 ; i < index; i ++){
            currentNode = currentNode.getNextLink();
        }
        currentNode.setData(num);
    }
    public T getDataByPosition(int indexs){
        DoubleListNode currentNode = head;
        if(indexs == 0){
            return (T)currentNode.getData();
        }
        else {
            for(int i = 1 ; i <= indexs; i++){
                currentNode = currentNode.getNextLink();
            }
        }
        return(T)currentNode.getData();
    }
}
public class Q6{
    public static void main(String[] args){
        
        DoubleLinkedList <Integer> list = new DoubleLinkedList<>();
        
        int num;
        
        System.out.print("The random numbers are : ");
        
        for(int i = 0 ; i < 10 ; i++){
            num  = (int)(Math.random()*101);
            System.out.print(num+" ");
            list.addRightNode(num);
        }
        System.out.println("\nInsert the random numbers into the double linked list");
        list.showList();
        System.out.println("\nRemove a number from the third position");
        list.deleteNodeByPosition(2);
        list.showList();
        System.out.println("\nReplace the number in seventh position with 999");
        list.replace(6, 999);
        list.showList();
        for(int i = 0 ; i < list.length(); i++){
              if(list.getDataByPosition(i) % 2 == 0){
                  list.deleteNodeByPosition(i);
              }
        }
        System.out.println("\nRemove all even number from the double linked list");
        list.showList();
    }
}
