package Q3;
public class HashTable<K,V> {
    private MapNode head;
    
    public HashTable(){
        head = null;
    }
    
    public boolean isEmpty(){
        return(head == null);
    }
    
    public int getSize(){
        int count = 0;
        MapNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void showHashTable(){
        MapNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    
    public V put(Comparable<K> k , V v){
        if(isEmpty()){
            head = new MapNode(k, v, null);
        }
        else{
            MapNode newNode = new MapNode(k, v ,null);
            MapNode currentNode = head;
            MapNode previousNode = null;
            while(currentNode != null){
                if(k.compareTo((K)currentNode.getKey())== 0){
                    V temp = (V) currentNode.getValue();
                    currentNode.setValue(v);
                    return temp;
                }
                else {
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
            }
            if(previousNode == null){
                newNode.setLink(head);
                head = newNode;
            }
            else{
                previousNode.setLink(newNode);
                newNode.setLink(currentNode);
            }
        }
        return null;
    }
    
    public V get(Comparable<K> k){
        MapNode currentNode = head;
        while(currentNode  != null){
            if(k.compareTo((K)currentNode.getKey()) == 0){
                return(V)currentNode.getValue();
            }
            else{
                currentNode = currentNode.getLink();
            }
        }
        return null;
    }
    
    public boolean containsKey(Comparable<K> k){
        MapNode currentNode = head;
        while(currentNode != null){
            if(k.compareTo((K)currentNode.getKey()) == 0){
                return true;
            }
            else{
                currentNode = currentNode.getLink();
            }
        }
        return false;
    }
    
    public boolean containsValue(Comparable<V> v){
        MapNode currentNode = head;
        while(currentNode != null){
            if(v.compareTo((V)currentNode.getValue()) == 0){
                return true;
            }
            else{
                currentNode = currentNode.getLink();
            }
        }
        return false;
    }
}
