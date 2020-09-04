package Q3;
public class MapNode <K, V>{
    private K key;
    private V value;
    private MapNode link;
    
    public MapNode(){
        key = null;
        value = null;
        link = null;
    }
    
    public MapNode(K a, V b , MapNode c){
        key = a;
        value = b;
        link = c;
    }
    
    public void setKey(K a){
        key = a;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public MapNode getLink() {
        return link;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setLink(MapNode link) {
        this.link = link;
    }
    public String toString(){
        return key +":"+value+" --> ";
    }
}
