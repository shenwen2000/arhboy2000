package Q1;
public class ListNode<T> {
    private T data;
    private ListNode link;
    
    public ListNode(){
        data = null;
        link = null;
    }
    
    public ListNode(T a, ListNode b){
        data = a;
        link = b;
    }

    public T getData() {
        return data;
    }

    public ListNode getLink() {
        return link;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLink(ListNode link) {
        this.link = link;
    }
    
    public String toString(){
        return data + " --> ";
    }
}
